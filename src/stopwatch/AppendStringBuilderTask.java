package stopwatch;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Append chars to a StringBuilder.
 * 
 * @author Kanchanok Kannee
 *
 */
public class AppendStringBuilderTask implements Runnable {

	private String filename;
	private int size;

	/**
	 * 
	 * Initialize the AppendStringBuilderTask.
	 * 
	 * @param filename is the file that you want to read.
	 * 
	 */
	public AppendStringBuilderTask(String filename) {
		this.filename = filename;
		this.size = 0;
	}

	/**
	 * Read the file to a StringBuilder object and append chars to a StringBuilder.
	 */
	@Override
	public void run() {
		InputStream in = null;
		InputStreamReader reader = null;
		StringBuilder result = new StringBuilder();
		try {
			in = new FileInputStream(filename);
			reader = new InputStreamReader(in);
			int c;
			while ((true)) {
				c = in.read();
				if (c < 0)
					break;
				result = result.append((char) c);
			}
			if (reader != null)
				reader.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		size = result.length();
		result.toString();
	}

	/**
	 * Return the Task's description.
	 * 
	 * @return the description of the task
	 */
	public String toString() {
		return "Reading " + size + " Alice-in-Wonderland.txt using FileReader, append to StringBuilder";

	}

}
