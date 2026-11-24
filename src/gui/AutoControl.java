
package gui;

import java.io.IOException;

import business.Auto;
import business.AutoModel;
import javafx.stage.Stage;

public class AutoControl {

    private AutoModel model;
    private AutoView view;

    public AutoControl(Stage primaryStage) {
        this.model = new AutoModel();
        this.view = new AutoView(primaryStage, this.model, this);
    }

    public void nehmeAutoAuf(
            String kennzeichen,
            String typ,
            String modell,
            String tagespreis,
            String vermietetVonBis) {

        try {
            Auto a = new Auto(
                kennzeichen,
                typ,
                modell,
                Float.parseFloat(tagespreis),
                vermietetVonBis.split(";")
            );

            this.model.setAuto(a);

            this.view.zeigeInformationsfensterAn(
                "Das Auto wurde aufgenommen!");

        } catch (Exception exc) {
            this.view.zeigeFehlermeldungsfensterAn(
                exc.getMessage());
        }
    }

    public void leseAusDatei(String typ) {
        try {
            if ("csv".equals(typ)) {
                this.model.leseAusDatei();

                this.view.zeigeInformationsfensterAn(
                    "Die Autos wurden gelesen!");
            } else {
                this.view.zeigeInformationsfensterAn(
                    "Noch nicht implementiert!");
            }
        } catch (IOException exc) {
            this.view.zeigeFehlermeldungsfensterAn(
                "IOException beim Lesen!");
        } catch (Exception exc) {
            this.view.zeigeFehlermeldungsfensterAn(
                "Unbekannter Fehler beim Lesen!");
        }
    }

    public void schreibeAutosInCsvDatei() {
        try {
            this.model.schreibeAutosInCsvDatei();

            this.view.zeigeInformationsfensterAn(
                "Die Autos wurden gespeichert!");

        } catch (IOException exc) {
            this.view.zeigeFehlermeldungsfensterAn(
                "IOException beim Speichern!");
        } catch (Exception exc) {
            this.view.zeigeFehlermeldungsfensterAn(
                "Unbekannter Fehler beim Speichern!");
        }
    }
}
