package com.test.demo


// what is a Method
// named block of code
// make code modular and reusable
// method can take parameters
// can have return type

def printHello(){
	println "Hello..."
}

printHello() //Call method once it's declared

//Example#1
def sum(int a, int b) {
	println "Sum is "+(a+b)
}

sum(5,6) // if there are no arguments, there will be an expcetion

//Example#2
def sum1(int a1=10, int b1=20) {
	println "Sum is "+(a1+b1)
}

sum1() //Calling method without arguments as they're declared by default


//Example#3 with return types
def sub(int a2=100, int b2=50) {
	def c2 = a2 -b2
	return c2
}

def result= sub() // Here we are calling sub method and storing the value in result which is returned by method
println "Sub. is " + result 

