package reader;

import java.io.BufferedReader;
import java.io.FileReader;

public class Buffered {

	public static void main(String[] args ) throws Exception {
	String path = "/Users/animesh/Desktop/PiiT/PnT.txt";
	
	BufferedReader br = new BufferedReader(new FileReader("/Users/animesh/Desktop/PiiT/PnT.txt"));
	int n;
	
	while ((n = br.read())!= -1) {
	System.out.println(n);
	}
	}
}
