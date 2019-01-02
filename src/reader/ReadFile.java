package reader;

import java.io.File;
import java.io.IOException;
import java.util.Formatter;

public class ReadFile {
	
	public static void main(String [] args) throws Exception {
		File folder = new File("Users/animesh/Desktop/PiiT");
		folder.mkdir();
	System.out.println("Folder is created");
	File file = new File("/Users/animesh/Desktop/PiiT/PnT.txt");
	file.createNewFile();
	System.out.println("File is created");
	Formatter write = new Formatter("/Users/animesh/Desktop/PiiT/PnT.txt");
	write.format("Hello People and Tech. Build your future.");
	write.close();
	System.out.println("Check your file on Desktop");
	}
}
