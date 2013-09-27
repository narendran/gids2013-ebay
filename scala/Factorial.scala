object Factorial {

	def fact(num: Int) : BigInt  = {
	  		if(num==1){
	  			Thread.dumpStack()
	  			1
	  		} else {
	  			 fact(num-1)
	  		}
	  	}

	def main(args: Array[String]): Unit = {
		println(fact(20000))
	}
	
}