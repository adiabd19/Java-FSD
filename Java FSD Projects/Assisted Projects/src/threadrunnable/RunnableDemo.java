package threadrunnable;

public class RunnableDemo implements Runnable{

public  void run() {
		
		for(int i=1; i<5; i++) {
			
			System.out.println(i+ " "+Thread.currentThread().getName());
		
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			
		}
}
}
		
		
		 
	
