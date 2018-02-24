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

	/**
	 * 
	 */
	@Override
	public String run() {

		String result = "";
		InputStream in = null;
		InputStreamReader reader = null;
		try {
			in = new FileInputStream(
					"/Users/mailtoy/Documents/workspace/Practice-Stopwatch/src/stopwatch/Alice-in-Wonderland.txt");
			reader = new InputStreamReader(in);
			int c;
			while ((true)) {
				c = in.read();
				if (c < 0)
					break;
				result = result + (char) c;
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		if (reader != null)
			try {
				reader.close();
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
		return "Reading Alice-in-Wonderland.txt using FileReader, append to String";

	}

}
