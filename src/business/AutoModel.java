package business;

	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;

import fileCreatorsNaser.ReaderProductNaser;
import fileCreatorsNaser.ConcreateCreatorCsvTxt; 
import fileCreatorsNaser.ReaderCreatorNaser; 

	


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

	    public void leseAusDatei(String typ) throws IOException {
	    	ReaderCreatorNaser creator;
	    	ReaderProductNaser product;

	        creator = new ConcreateCreatorCsvTxt();
	        
	        product = creator.factoryMethod(typ);
	        try {
	            String[] zeile = product.leseAusDatei();

	            this.auto = new Auto(
	                    zeile[0],
	                    zeile[1],
	                    zeile[2],
	                    Float.parseFloat(zeile[3]),
	                    zeile[4].split("_")
	            );

	        } finally {
	            product.schliesseDatei();
	        }
	    }

	    public void schreibeAutosInCsvDatei() throws IOException {

	        BufferedWriter aus = new BufferedWriter(
	                new FileWriter("AutosAusgabe.csv", true));

	        aus.write(this.auto.gibAutoZurueck(';'));

	        aus.close();
	    }
	}



