package fileCreatorsNaser;

import java.io.IOException;

public abstract  class ReaderCreatorNaser {
	  public abstract ReaderProductNaser factoryMethod(String typ)
	            throws IOException;
	}

	