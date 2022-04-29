package com.test.demo

//Variables are used to store the information, This can be different types
//e.g. string, boolean,etc..the reason we've different data types because each data type has 
// specific range and it helps to save the memory
// In Groovy instead of data type we can use "def", here it's doing dynamically type casting
println "========Byte========"
//byte
byte a = 10
println a
println Byte.MIN_VALUE
println Byte.MAX_VALUE
println "========Short========"
//short
short s = 200
println s
println Short.MIN_VALUE
println Short.MAX_VALUE
println "========Integer========"
//integer
int i = 200
println i
println Integer.MIN_VALUE
println Integer.MAX_VALUE
println "========Long========"
//long
long l = 200
println l
println Long.MIN_VALUE
println Long.MAX_VALUE
println "========Float========"
//float
float f = 200.3434F
println f
println Float.MIN_VALUE
println Float.MAX_VALUE
println "========Double========"
//Double
double d = 1000.34343
println d
println Double.MIN_VALUE
println Double.MAX_VALUE
println "========Char========"
//char used to store single character
char c = 'A'
println c
println "========Boolean========"
//Boolean
boolean flag = true
println flag
println "========String========"
//String is used to store the string characters
String str = "Groovy"
println str


// In Groovy instead of data type we can use "def", here it's doing dynamically type casting,let take an example
println "========Byte========"
//here output will be successful but we don't know which type of data type it is, so we've a class
// to show output, the output shows that it's an Interger

def x = 10
println x
println x.getClass().getName()
