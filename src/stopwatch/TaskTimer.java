package stopwatch;

/**
 * That will compute and print the elapsed time for any task, without any
 * duplicate code.
 * 
 * @author Kanchanok Kannee
 *
 */
public class TaskTimer {
	
	/**
	 * Runs a task, measures and prints its running time to the console.
	 * @param runnable
	 */
	  public void measureElapsed(Runnable runnable){
	        Stopwatch stopwatch = new Stopwatch();
	        stopwatch.start();
	        runnable.run();
	        stopwatch.stop();
	        System.out.println(runnable.toString());
	        System.out.printf("Read chars in %.6f sec.\n", stopwatch.getElapsed());

	    }

}
