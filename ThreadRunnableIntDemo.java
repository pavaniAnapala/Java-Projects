package ThreadProg;

public class ThreadRunnableIntDemo implements Runnable{

	/**
	 * @param args
	 */
	public void run(){
		System.out.println("Thread new is running..");
	}
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		ThreadRunnableIntDemo t1 = new ThreadRunnableIntDemo();
		Thread t2 = new Thread(t1);
		t2.run();

	}

}
