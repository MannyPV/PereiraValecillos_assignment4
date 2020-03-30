

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class DuplicateRemover {
	
	void remove(String datafile) {
		
		File file= new File("problem1.txt");
		
	
	}
	void write(String outputFile ) {
		String word= outputFile;
		try {
			FileWriter myWriter = new FileWriter("unique_words.txt");
			myWriter.write(word);
			System.out.println("unique Word in file");
			myWriter.close();
		}
		catch(IOException e) {
			System.out.println("An error occurred.");
		}
	}
}
