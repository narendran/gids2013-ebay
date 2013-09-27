public class StrategyExample {

	// Create an interface called Strategy
	interface Strategy{
		int execute(int a, int b);
	}

	static class Addition implements Strategy{
		public int execute(int a, int b){
			return a + b;
		}
	}

	static class Subtraction implements Strategy{
		public int execute(int a, int b){
			return a - b;
		}
	}

	static class Multiplication implements Strategy{
		public int execute(int a, int b){
			return a * b;
		}
	}

	static class Context {
		private Strategy strategy;

		public Context (Strategy inStrategy){
			this.strategy = inStrategy;
		}

		public int executeStrategy(int a, int b){
			return this.strategy.execute(a,b);
		}
	}

	public static void main(String[] args) {
		System.out.println("---- Strategy pattern - Simple Calculator ---") ;

		Context c1 = new Context(new Addition());
		System.out.println("Addition :  "+c1.executeStrategy(10,20));

		Context c2 = new Context(new Subtraction());
		System.out.println("Subtraction :  "+c2.executeStrategy(10,20));

		Context c3 = new Context(new Multiplication());
		System.out.println("Multiplication :  "+c3.executeStrategy(10,20));

	}
}