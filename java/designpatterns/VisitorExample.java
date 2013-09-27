public class VisitorExample {

	interface CarElement {
		void accept(CarVisitor visitor);
	}

	static class Wheel implements CarElement{
		public void accept(CarVisitor visitor) {
			visitor.visit(this);
		}
	}

	static class Body implements CarElement{
		public void accept(CarVisitor visitor){
			visitor.visit(this);
		}
	}

	interface CarVisitor {
		void visit(Wheel wheel);
		void visit(Body body);
	}

	// Perfect way to achieve Open/Closed principle of SOLID. We can add a new behaviour to one class even without modifying its structure!
	// Every possible action/behaviour will have a visitor implementation.  To add that behaviour to a class A, you dont need to touch A. Just add a method to the visitor implementatoin and pass that Visitor implementation to the accept method of that class.
	static class PrintingCountVisitor implements CarVisitor{
		public void visit(Wheel wheel){
			System.out.println("Printing 4  Wheels");
		}
		public void visit(Body body){
			System.out.println("Printing 1 Car Body");
		}
	}

	static class PrintingModelVisitor implements CarVisitor{
		public void visit(Wheel wheel){
			System.out.println("Printing MRF tyres");
		}

		public void visit(Body body){
			System.out.println("Printing Model S Tesla");
		}
	}
	public static void main(String[] args) {
		Wheel wheel = new Wheel();
		wheel.accept(new PrintingCountVisitor());
		Body body = new Body();
		body.accept(new PrintingModelVisitor());
	}
}