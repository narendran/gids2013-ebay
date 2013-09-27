class Inheritance(real : Double, imaginary:Double) {
	def re = real
	def im = imaginary

	override def toString() = {
		re + " and imaginary " + im
	}

	def main(args: Array[String]): Unit = {
	  var inherit = new Inheritance(1.5,2.5)
	  println(inherit.toString);
	}
}