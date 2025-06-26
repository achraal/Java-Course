import java.lang.Thread;

public class App extends Thread{
	public static void main(String[] args) throws InterruptedException{
	
		App task = new App();
		App task2 = new App();
		
		task.start();
		task2.start();
		
		task.join();
		task2.join();
		
		System.out.println("Tous les traitements sont terminés");
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