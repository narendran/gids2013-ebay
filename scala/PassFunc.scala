object PassFunc{

	def oncePerSecond(callback : () => Unit) : Unit = {
		while(true) {
			callback();
			Thread.sleep(1000)		
		}
	}

	def mycallback() : Unit = {
		println("Narendran")
	}

	def main(args: Array[String]): Unit = {
	 	oncePerSecond(mycallback) 
	}
}