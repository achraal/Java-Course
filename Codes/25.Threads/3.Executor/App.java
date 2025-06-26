import java.util.concurrent.Executors;
import java.util.concurrent.Executor;

public class App{
	public static void main(String[] args){
	
		Executor ex = Executors.newSingleThreadExecutor();
		
		Runnable task = () -> 
		{
			for(int i = 0 ; i < 5 ; ++i){
				System.out.println(i);
			
				try{
					Thread.sleep(1500);
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

		
		ex.execute(task);
		ex.execute(task2);
		ex.shutdown();
	}
}