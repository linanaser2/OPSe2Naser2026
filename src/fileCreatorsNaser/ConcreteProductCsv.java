package fileCreatorsNaser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;




	public class ConcreteProductCsv extends ReaderProductNaser {

	    private BufferedReader reader;

	    public ConcreteProductCsv() throws IOException {
	        reader = new BufferedReader(new FileReader("Autos.csv"));
	    }

	    @Override
	    public String[] leseAusDatei() throws IOException {
	        String[] zeile = reader.readLine().split(";");
	        return zeile;
	    }

	    @Override
	    public void schliesseDatei() throws IOException {
	        reader.close();
	    }
	    
	    
	}


