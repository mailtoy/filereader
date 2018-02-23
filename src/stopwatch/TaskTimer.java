package stopwatch;

public class TaskTimer {
	
	public static void main(String[] args) {
		Stopwatch stopwatch = new Stopwatch();
		stopwatch.start();
		AppendStringTask task = new AppendStringTask();
		String text = task.run();
		stopwatch.stop();
		System.out.println(task.toString());
		System.out.printf("Read %d chars in %.6f sec.\n", text.length(), stopwatch.getElapsed());
		
		Stopwatch stopwatch2 = new Stopwatch();
		stopwatch2.start();
		AppendStringBuilderTask task2 = new AppendStringBuilderTask();
		String text2 = task.run();
		stopwatch2.stop();
		System.out.println(task2.toString());
		System.out.printf("Read %d chars in %.6f sec.\n", text2.length(), stopwatch2.getElapsed());
		
		Stopwatch stopwatch3 = new Stopwatch();
		stopwatch3.start();
		AppendStringUseBufferedReader task3 = new AppendStringUseBufferedReader();
		String text3 = task.run();
		stopwatch2.stop();
		System.out.println(task3.toString());
		System.out.printf("Read %d chars in %.6f sec.\n", text3.length(), stopwatch3.getElapsed());
		
	}
	
	
	

}
