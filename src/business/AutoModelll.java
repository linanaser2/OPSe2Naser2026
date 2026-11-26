/*package business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AutoModel {

    private Auto auto;

    public AutoModel() {
    	
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public void leseAusDatei() throws IOException{
        
        //    BufferedReader ein = new BufferedReader(new FileReader("Autos.csv"));
    	String []zeile= reader.readLine(); 
            String[] zeile = ein.readLine().split(";");
            this.auto = new Auto(
                zeile[0],
                zeile[1],
                zeile[2],
                Float.parseFloat(zeile[3]),
                zeile[4].split("_"));
            reader.close(); 
            //	ein.close();
         
    }

    public void schreibeAutosInCsvDatei() throws IOException {
        BufferedWriter aus = new BufferedWriter(
            new FileWriter("AutosAusgabe.csv", true));

        aus.write(this.auto.gibAutoZurueck(';'));
        aus.close();
    }
}

*/




