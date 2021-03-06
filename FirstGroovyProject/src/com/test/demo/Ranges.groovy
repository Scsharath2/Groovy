package com.test.demo

import org.codehaus.groovy.control.InstanceOfVerifier

//Ranges are another type of collection apart from maps and list
// Creates a list of sequential values
// denoted by first and last value of the sequences
// There are two types of ranges, inclusive & exclusive
//1..10 - inclusive
//1..<10 - exclusive
//Range is an instance of Java
def range = 1..10
println range //prints 1..10, doesn't not iterate all the elements
println range.size() // prints size, here it is 10
println range.getFrom() // prints starting range
println range.getTo() //prints ending range

assert range.from == 1 //assert basically verifies the value 
assert range.to == 10

println range.get(3) //return value 4 as indexing starts from 0
println range[3] //return value 4 as indexing starts from 0

println range.contains(6) //checks if the value is in the range, here it returns true
println range.isReverse() // returns false because range is not reverse

def range2 =range.subList(3, 7)
println range2.getFrom()
println range2.getTo()

//iterate on a range, prints 1 to 10

for (i in range) {
	println i
}

//Using Closures below
(1..10).each{ i -> 
	println "Value = $i"
	
}

println range instanceof java.util.List //here it returns true because range is instance of java
