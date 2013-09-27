public class ThreadConcise {
	public static void main(String args[]){
		System.out.println("Concise thread definitions");

		/*Runnable r = new Runnable(){

			@Override
			public void run(){
				System.out.println("Hello, by a thread!");
			}

		};*/

		Runnable r = () -> {System.out.println("Hello, by a concise thread!");};		
		r.run();
	}
}