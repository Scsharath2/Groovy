package OOPS

class Toyota extends cars {
	
	int topspeed ;
	
	def topspeed() {
		println "Top Speed is $topspeed"
	}	
	
	static void main(args) {
		Toyota car1 =  new Toyota();
		car1.name = "Toyota"		
		car1.color - "Red"
		car1.model = 2019
		car1.topspeed = 200
		car1.startEngine()
		car1.accelerate()
		car1.topspeed()
		car1.stopEngine()
	}
}
