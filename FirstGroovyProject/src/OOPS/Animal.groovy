package OOPS

//OOP Inheritance
//process where one class acquires properties (methods and fields or attributes) from another class
// The class from where inheritance is done is called (parent class Or super class or base class) and the class which inherits is called (child class
// or sub class or derived class)
//When we've same function in parent class and child class, child function class overwrites parent function class.this is called 
//method overriding
 
class Animal {
	String name
	String breed
	
	def eats() {
		println "$name eats"
	}
	def moves() {
		println "$name moves"
		
	}

	
	
		
	static void main(args) {
		// TODO Auto-generated method stub
		
	}
}
