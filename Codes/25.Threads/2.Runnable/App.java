import java.lang.Thread;

public class App implements Runnable{
	public static void main(String[] args) throws InterruptedException{
	
		Thread task = new Thread(new App());
		Thread task2 = new Thread(new App());
		
		task.start();
		task2.start();
		
	}
	
	@Override
	public void run(){
		for(int i = 0 ; i < 5 ; ++i){
			System.out.println(i);
			
			try{
				Thread.sleep(1500);
			}
			catch (InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
	}
}