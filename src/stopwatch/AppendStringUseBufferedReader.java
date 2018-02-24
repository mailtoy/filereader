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

	/**
	 * 
	 */
	@Override
	public String run() {
		FileReader reader = null;
		BufferedReader br = null;
		String result = "";
		String line = "";
		try {
			reader = new FileReader(
					"/Users/mailtoy/Documents/workspace/Practice-Stopwatch/src/stopwatch/Alice-in-Wonderland.txt");
			br = new BufferedReader(reader);
			while ((line = br.readLine()) != null)
				result = result + line + '\n';
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		if (br != null)
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		return result;
	}

	/**
	 * Return the Task's description.
	 * 
	 * @return the description of the task
	 */
	public String toString() {
		return "Reading Alice-in-Wonderland.txt using FileReader, append lines to String";

	}

}
