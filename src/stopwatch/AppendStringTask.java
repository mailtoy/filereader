package stopwatch;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Append chars to a string.
 * 
 * @author Kanchanok Kannee
 *
 */
public class AppendStringTask implements Runnable {

	private int size;
	private String result = "";
	private String filename;

	/**
	 * 
	 * Initialize the AppendStringTask.
	 * 
	 * @param filename is the file that you want to read.
	 * 
	 */
	public AppendStringTask(String filename) {
		this.filename = filename;
		this.result = "";
		this.size = 0;
	}

	/**
	 * Read a text file one character at a time. Append all the characters to a
	 * String and return the String.
	 */
	@Override
	public void run() {

		InputStream in = null;
		InputStreamReader reader = null;
		try {
			in = new FileInputStream(filename);
			reader = new InputStreamReader(in);
			int c;
			while ((true)) {
				c = in.read();
				if (c < 0)
					break;
				result = result + (char) c;
			}
			if (reader != null)
				reader.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		size = result.length();
	}

	/**
	 * Return the Task's description.
	 * 
	 * @return the description of the task.
	 */
	public String toString() {
		return "Reading " + size + " chars Alice-in-Wonderland.txt using FileReader, append to String";

	}

}
