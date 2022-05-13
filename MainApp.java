package p1;

public class MainApp {

	public static void main(String[] args) {
		// Annonymous class
	
		new Thread() {
			public void run() {
				System.out.println("Run method");
			}

		}.start();
		Runnable rob=new Runnable() {
			public void run() {
				System.out.println("Runnable run method");
				
			}
		};
		Thread tob1=new Thread(rob);
		tob1.start();
		
	
			
		}
		
	}


