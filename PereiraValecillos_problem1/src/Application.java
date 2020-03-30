
import java.io.*;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		DuplicateRemover duplicateRemover = new DuplicateRemover();
		File file1 = new File("problem1.txt");
		File file2 = new File("unique_words.txt");
		try {
			
			if(file1.createNewFile() &&file2.createNewFile()) {
			System.out.println("Files Created");
			}
			
			else {
			System.out.println("Files already Created");
			}
			
		}catch(Exception a) {
			System.out.println("error in building file");
		}
		System.out.println("What is your unique words");
		Scanner sc = new Scanner(System.in);
		String words = sc.next();
		duplicateRemover.write(words);
		
		System.out.println("What word do you want to delete");
		String words2 = sc.next();
		duplicateRemover.remove(words2);
		sc.close();
	}
}
