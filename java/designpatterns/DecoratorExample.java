public class DecoratorExample{

	interface IceCream{
		String getIceCream();
	}

	static class SimpleIceCream implements IceCream{
		public String getIceCream(){
			return "Simple IceCream";
		}
	}

	// Decorator has the same implementation as the  basic implementation except that it has a private variable and a parameterized constructor.
	static class NuttyDecorator implements IceCream {
		private IceCream baseIceCream;
		public NuttyDecorator(IceCream iceCream){
			baseIceCream = iceCream;
		}
		public String getIceCream(){
			return baseIceCream.getIceCream() + " + nuts";
		}
	}

	// Decorator has the same implementation as the  basic implementation except that it has a private variable and a parameterized constructor.
	static class FruityDecorator implements IceCream {
		private IceCream baseIceCream;
		public FruityDecorator(IceCream iceCream){
			baseIceCream = iceCream;
		}
		public String getIceCream(){
			return baseIceCream.getIceCream() + " + fruits";
		}
	}


	public static void main(String[] args) {
		IceCream iceCream = new FruityDecorator(new SimpleIceCream());
		System.out.println(iceCream.getIceCream());
		IceCream iceCream1 = new NuttyDecorator(new FruityDecorator(new SimpleIceCream()));
		System.out.println(iceCream1.getIceCream());
	}
}