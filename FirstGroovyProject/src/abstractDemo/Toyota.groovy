package abstractDemo

class Toyota extends Car {
	int topSpeed
	
	@Override
	public Object topSpeed() {
		println "Tops speed for $name is $topSpeed"
	}
	
	static void main(args) {
		Toyota car1 = new Toyota()
		car1.name = "Toyota"
		car1.model = 2019
		car1.color = "Black"
		car1.topSpeed = 250
		car1.startEngine()
		car1.topSpeed()
	}
	
}
