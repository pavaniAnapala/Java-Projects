package ThreadProg;

public class ThreadDemo1 extends Thread{
	public void run(){
		System.out.println("Thread is running..."+ Thread.currentThread().getName());
		System.out.println("THread Priority is "+ Thread.currentThread().getPriority());
		for(int i=0;i<5;i++){
			try{
				Thread.sleep(1000);
				
			}catch(InterruptedException  e){
				System.out.println(e);
			}System.out.println(i);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo1 t1 =new ThreadDemo1();
		ThreadDemo1 t2 = new ThreadDemo1();
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();
		//t1.start(); // Exception in thread "main" java.lang.IllegalThreadStateException
		/*. After starting a thread, it can never be started again. */
		System.out.println("Name of t1:"+t1.getName());  
		  System.out.println("Name of t2:"+t2.getName());  
		  System.out.println("id of t1:"+t1.getId()); 
		  
		  t1.setName("Pavani Boga");  
		  System.out.println("After changing name of t1:"+t1.getName());  
		
		
	}

}
