package abstractDemo

//Abstract class  provides a template for future specific class
//we cannot create objects in the abstract class
//https://stackoverflow.com/questions/3344816/when-and-why-to-use-abstract-classes-methods
abstract class Car {
	
	String name;
	String color;
	int model;
	
	def startEngine() { //Concrete methods 
		println "Engine started for $name"
		
	}
	abstract def topSpeed(); //abstract methods
}
//why abstract classes
//when ever you want to have all  the generic methods, functions, abstracts together, you can create and class
// and make it as abstract