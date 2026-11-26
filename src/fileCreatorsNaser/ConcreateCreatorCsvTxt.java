package fileCreatorsNaser;
import java.io.IOException;
public class ConcreateCreatorCsvTxt {



public class ConcreteCreatorCsvTxt extends ReaderCreatorNaser{
	
	@Override
	public ReaderProductNaser factoryMethod(String typ) throws IOException {
		
		if("csv".equals(typ)){
			return new ConcreteProductCsv();
      		}
       		else{
	   			return new ConcreteProductTXT();
	   		}
	
	}

}

}
