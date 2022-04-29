package OOPS

//Here we're calling the class from Car.Groovy, Meaning Class is defined in one file and we're calling that class in
// and creating objects

class CarObject {

	static void main(args) {
		//Creating objects for the class
		Car toyoto = new Car()
		Car ford = new Car()
		Car mercedes = new Car()
		//Assign values
		toyoto.name = "Tata"
		toyoto.model = 2019
		toyoto.color = "Red"
		
		ford.name = "Hyundai"
		ford.model = 2020
		ford.color = "Blue"
		
		mercedes.name = "BMW"
		mercedes.model = 2022
		mercedes.color = "Black"
		
		//Calling functions
		println "===================="
		toyoto.getCarDetails()
		toyoto.startEngine()
		println "===================="
		ford.getCarDetails()
		ford.startEngine()
		println "===================="
		mercedes.getCarDetails()
		mercedes.startEngine()
		println "===================="
		
	}
}
