package com.test.demo

//Curly braces are not required if there is only one statement but it's best practice to use it

def  num = 11

if (num==10)
	println "num is 10"
else
	println "num is NOT 10"
	
//Check if the number is +ve or -ve	, nested else if
def  num1 = -11
	
if (num>0)
	println "num is +ve"
else if(num==0)
	println "num is 0"
else
	println "num is -ve"
	
// switch-case
	
int x = 10
def result = ""

switch(x) {
	case 0:
		result = "x is zero"
		break // if this statement is not written, then it will try to execute next statements even if
			 // the condition is true and it will be a overhead for the application 
	case {x>0}:
		result = "x is +ve"
		break
	case {x<0}:
		result = "x is -ve"
	default:// this is default statement which runs when no condition is true
		result = "Invalid Number"
}
println result