package stopwatch;

public class Stopwatch {
	
	private long startTime;
	private long stopTime;
	private boolean running;
	private static final double NANOSECONDS = 1.0E-9;
	
	public Stopwatch(){
		running = false;
	}

	public void start() {
		if (this.running == false) {
			this.startTime = System.nanoTime();
			this.running = true;
		}
	}
	
	public void stop() {
		if (this.running == true) {
			this.stopTime = System.nanoTime();
			this.running = false;
		}
	}
	
	public boolean isRunning(){
		return running;
	}
	
	public double getElapsed(){
		if (running) {
			return (System.nanoTime() - startTime) * NANOSECONDS;
		} else {
			return (stopTime - startTime) * NANOSECONDS;
		}
	}

}
