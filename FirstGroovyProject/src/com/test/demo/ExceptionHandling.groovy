package com.test.demo

//http://groovy-lang.org/semantics.html#_exception_handling
//Just like java, in Groovy exception handling is done. The good thing about the exception handling
// is even there a exception, it doesn't stop the code execution meaning it executes the code 
// which comes after the exception 


//i =1/0 // There is ArthmeticException when you run this code.To handle this type of Exceptions, you can add the some code to handle it
	// This is where try-catch in to picture 





//try-catch
//Once there is a errors, it executes the exception block and prints the message

try {
int i =1/0
}catch(Exception exp) {
	println "I'm inside the exception block"
	println exp.getCause()
	println exp.getMessage() //it will show you the message
	//exp.printStackTrace() //it will give detailed information fo the exception
}

println "Another set of code"

//try-catch-finally

// Can have multiple try catch exceptions. So when here there is arithmetic error,it goes to
//  ArithmeticException block. If there is any other error, then it goes to Exception block.
//but good thing is it executes the finally block even if there is any error or not
// try i = 1/1 or 1 =1/0 to know the difference

try {
	int i =1/1
	}catch(ArithmeticException exp1) {
		println "Catch Block to catch Arithmetic exp"
	}
	
catch(Exception exp) {
		println "I'm inside the exception block"
		println exp.getCause()
		println exp.getMessage() //it will show you the message
		//exp.printStackTrace() //it will give detailed information for the exception
	}finally {// If you want to run anything irrespective of the exception, put it in finally bloc
		println "I am inside the finally block"
	}
	

//try-finally
	
try {
int i =1/1

}finally {
println "I am inside finally block2"
}