package stopwatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Append lines to String.
 * 
 * @author Kanchanok Kannee
 *
 */
public class AppendStringUseBufferedReader implements Runnable {

	private String filename;
	private int size;

	/**
	 * 
	 * Initialize the AppendStringUseBufferedReader.
	 * 
	 * @param filename
	 *            is the file that you want to read.
	 * 
	 */
	public AppendStringUseBufferedReader(String filename) {
		this.filename = filename;
		this.size = 0;
	}

	/**
	 * 
	 */
	@Override
	public void run() {
		FileReader reader = null;
		BufferedReader br = null;
		String result = "";
		String line = "";
		try {
			reader = new FileReader(filename);
			br = new BufferedReader(reader);
			while ((line = br.readLine()) != null)
				result = result + line + '\n';
			if (br != null)
				br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		size = result.length();

	}

	/**
	 * Return the Task's description.
	 * 
	 * @return the description of the task
	 */
	public String toString() {
		return "Reading " + size + " Alice-in-Wonderland.txt using FileReader, append lines to String";

	}

}
