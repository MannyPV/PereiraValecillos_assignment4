import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class DuplicateCounter {

	void count(File datafile) {
		//use map to count the words
		int wordCounter;
	}
	void write(File file) {
		try{PrintWriter output = new PrintWriter(file);
		Scanner sc = new Scanner("problem2.txt");
		System.out.println("What the word you want to write");
		String word= sc.next();
		output.println(word);
		
		
		sc.close();
		output.close();
		
		}catch(Exception b) {}
	}
}
