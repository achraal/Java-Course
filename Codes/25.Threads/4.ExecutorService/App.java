import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class App{
	public static void main(String[] args){
	
		ExecutorService ex = Executors.newCachedThreadPool();
		
		Runnable task = () -> 
		{
			for(int i = 0 ; i < 5 ; ++i){
				System.out.println(i);
			
				try{
					Thread.sleep(1000);
				}
				catch (InterruptedException e){
					System.out.println(e.getMessage());
				}
			}
		};
		
		
		Runnable task2 = () ->  
		{
			for(int i = 5 ; i < 9 ; ++i){
				System.out.println("ici on continue la 2e tache " + i);
			
				try{
					Thread.sleep(1500);
				}
				catch (InterruptedException e){
					System.out.println(e.getMessage());
				}
			}
		};

		Future<?> f1 = ex.submit(task);
		Future<?> f2 = ex.submit(task2);

		while(!(f1.isDone()) || !(f2.isDone())){
			System.out.println("On attend...");
			
			try{
				Thread.sleep(500);
			}
			catch (InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
			
				
		if((f1.isDone()) && (f2.isDone()))
			System.out.println("FINITO!");
		
		ex.shutdown();
	}
}