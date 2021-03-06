package com.test.demo

//https://medium.com/@dis_is_patrick/practical-uses-for-closures-c65640ae7304

//Closures is a block of code that can take parameter
// refer variables
// Return Values
// Can be passed as parameter in a method
 
def myClosure1 = {
	println "Hello World"
}
myClosure1.call()

//Example#2

def myClosure2 = {
	name -> println "Hello ${name}"
}

myClosure2.call("Pam")


//Example#3 //In functions we cannot refer the variable in a method like below
def str = "Hello"

def myClosure3 = {
	name -> println "$str $name"
}
myClosure3.call("Pam")

//Example#4 we can also pass closures as parameters to a method
def myMethod(clos) {
	clos.call("Groovy")
}

myMethod(myClosure2) //here method is calling myClosure2 closure

//Example#5 Passing parameters

def myClosure4 = {
	a,b,c ->
	return a+b+c
}

def res = myClosure4(1,2,3)
println res

//Example#6 Lists

def myList1 = ["Apples","Oranges","Grapes"]
println myList1.each { it }

//Example#7 Maps

def myList2 = ['Subject':'Groovy','Topic':'Closures']
println myList2.each { it }


def myList3 = [1,2,3,4,5]
println myList3.find{item -> item == 4} // find the number 4 in the list
println myList3.findAll{item -> item > 2} // it returns all numbers greater than 2
println myList3.any { item -> item >3 } //it return true or false 
println myList3.collect {item -> item*2  } //it multiples every item in the list
