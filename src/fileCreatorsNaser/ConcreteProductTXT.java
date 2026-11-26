package fileCreatorsNaser;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ConcreteProductTXT extends ReaderProductNaser {

    private BufferedReader reader;

    public ConcreteProductTXT() throws IOException {
        reader = new BufferedReader(
                new FileReader("Autos.txt"));
    }

    @Override
    public String[] leseAusDatei() throws IOException {

        String[] ergebniszeile = new String[5];
        String zeile = reader.readLine();
        int i = 0;

        while (i < ergebniszeile.length) {
            ergebniszeile[i] = zeile;
            zeile = reader.readLine();
            i++;
        }

        return ergebniszeile;
    }

    @Override
    public void schliesseDatei() throws IOException {
        reader.close();
    }
}