import java.io.*;

public class Application {
	public static void main(String[] args) {
		File file = new File("problem2.txt");
		File file2 = new File("unique_words_counts.txt");
		DuplicateCounter counter = new DuplicateCounter();
		counter.write(file);
		counter.count(file2);
	}
}
