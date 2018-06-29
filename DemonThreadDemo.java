package ThreadProg;

public class DemonThreadDemo extends Thread{
		public void run(){
			System.out.println("Name"+ Thread.currentThread().getName());
			System.out.println("Is DEamon"+ Thread.currentThread().isDaemon());
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DemonThreadDemo t1 = new DemonThreadDemo();
			DemonThreadDemo t2 = new DemonThreadDemo();
			
			t1.start();
			t2.setDaemon(true);
			t2.start();
			//t2.setDaemon(true);//cannot set as demon after the thread is started. Error
			
	}

}
