public class Factorial {

	public long fact(int num){
		if(num == 1) {
			Thread.dumpStack();
			return 1;
		}

		else
			return fact(num-1);
	}

	public static void main(String args[]){
		System.out.println(new Factorial().fact(20000));
	}

}