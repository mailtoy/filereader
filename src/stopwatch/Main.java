package stopwatch;

/**
 * Main class use to compare speed of using different data types.
 * 
 * @author Kanchanok Kannee
 *
 */
public class Main {

	private final static String FILE = "/Users/mailtoy/Documents/workspace/Practice-Stopwatch/src/stopwatch/Alice-in-Wonderland.txt";

	/**
	 * Run the tasks.
	 * 
	 * @param args not used.
	 */
	public static void main(String[] args) {
		TaskTimer taskTimer = new TaskTimer();
		taskTimer.measureElapsed(new AppendStringTask(FILE));
		taskTimer.measureElapsed(new AppendStringBuilderTask(FILE));
		taskTimer.measureElapsed(new AppendStringUseBufferedReader(FILE));
	}

}
