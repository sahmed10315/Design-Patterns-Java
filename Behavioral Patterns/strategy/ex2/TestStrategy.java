package strategy.ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Strategy patterns lets us select algorithms at runtime.
 * Reference : Effective Java, Bloch, Item 21.
 * Example in JDK : java.util.Comparator#compare(), executed by among others Collections#sort().
 */
public class TestStrategy {

	public static void main(String[] args) throws IOException {

		final Client clientConsole = new Client(new ConsoleLogging());
		clientConsole.doWork(32);

		final File tempFile = File.createTempFile("test", "log");
		final Client clientFile = new Client(new FileLogging(tempFile));
		clientFile.doWork(32);

		BufferedReader reader = new BufferedReader(new FileReader(tempFile));
		System.out.println(reader.readLine());
		reader.close();
	}
}
