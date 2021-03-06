package OOPS

class Car {
	//attributes
	String name;
	String color;
	int model;
	//functions
	def getCarDetails() {
		println "You're driving $name,$model,$color"
	}
	def startEngine() {
		println "Starting engine for $name"
		}
		
	//main Method
	static void main(args) {
		//Creating objects for the class
		Car toyoto = new Car()
		Car ford = new Car()
		Car mercedes = new Car()
		//Assign values
		toyoto.name = "Toyato"
		toyoto.model = 2019
		toyoto.color = "Red"
		
		ford.name = "Ford"
		ford.model = 2020
		ford.color = "Blue"
		
		mercedes.name = "mercedes"
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
