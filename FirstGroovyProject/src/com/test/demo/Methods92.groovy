package com.test.demo
// So if you want to call any method from any other class
// need to create object for that class and call the method. Here we need to call myMethod from class Methods92.
//So first create object
class Methods92 {

	static void main(args) {
		Methods92 myFunc = new Methods92() //object for the class Methods92 with a name myFunc.
		myFunc.myMethod() // now we can use myFunc Object and call methods available
		
	}
	def myMethod() {
		println ("I'm inside the myMethod")
	}
}
