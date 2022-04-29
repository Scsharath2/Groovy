package OOPS

//In OOPs, generally it's better to put all commons functions in one class and use it as reference
class cars {
	String name;
	String color;
	String model;
	
	def startEngine() {
		println ("Engine started for $name")
		
	}
	def stopEngine() {
		println("Engine Stopped for $name")
		
	}
	def accelerate() {
		println("Accelerated $name")
		
	}
}
