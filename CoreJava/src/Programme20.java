class ABC extends Thread
{
	
	public ABC() {
		super("child Thread");
		start();
	}
	public void run() {
		try {
			for (int i=0;i<5;i++)
			{
				System.out.println(this+" : "+i);
				Thread.sleep(700);
			}
		}catch(Exception e) {
			System.out.println("Exception");
		}
		System.out.println("child thread exiting");
	}
	
}

public class Programme20 {
	public static void main(String[] args) {
		new ABC();
		Thread t=Thread.currentThread();
		try {
			for(int i=0;i<5;i++)
			{
				System.out.print(t+" : "+i);
				Thread.sleep(1000);
			}
			
		}catch(Exception e) {
			System.out.println("Exception caught");
		}
		System.out.println("main thread exiting");
	}
}
