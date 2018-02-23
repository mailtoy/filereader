package stopwatch;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AppendStringBuilderTask implements Runnable {

	@Override
	public String run() {
		InputStream in = null;
		InputStreamReader reader = null;
		StringBuilder result = new StringBuilder();
		// read each character until you get -1, which means end-of-file
		try {
			in = new FileInputStream("/Users/mailtoy/Documents/workspace/Practice-Stopwatch/src/stopwatch/Alice-in-Wonderland.txt");
			reader = new InputStreamReader(in);
			int c; // use a "while" loop to read chars
			while ((true)) { // while ( c = reader.read()) >= 0)
				c = in.read();
				if (c < 0)
					break;
				result = result.append((char)c);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		// when you get to the end, close the file. Use a try-catch block.
		if (reader != null)
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		return result.toString();
	}
	
	public String toString(){
		return "Reading Alice-in-Wonderland.txt using FileReader, append to StringBuilder";
		
	}

}
