package com.test.demo
//https://alvinalexander.com/programming/printf-format-cheat-sheet/
print "Enter Your Name: "
def name = System.in.newReader().readLine()
println "Hello $name"

print "Enter first number"
def num1 = System.console().readLine().toInteger() //it converts to integer if there is any string

println "Enter Second numeber"
def num2 = System.console().readLine().toInteger() //it converts to integer if there is any string

println "$num1 +$num2 =" + (num1 +num2)

//output
//print - cursor will not move to next line
//println -cursor will move to next line
//printf  - in printf we use locators. we have %s for string , %d for integers
// %.2f which will take upto two decimal places , \n for next line.

def myName = "Dwight"
println "My Name is $myName"

printf "My Name is %s \n", myName

