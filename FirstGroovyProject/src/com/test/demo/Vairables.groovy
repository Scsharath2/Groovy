package com.test.demo

def name = "Dwight"
//println 'Name is '+name
println "Name is ${name}"

def name2 = 10
name2 = "Pam"
println name2
//Groovy is dynamically typed meaning data type can be changed 

def(String a,int b,double c) = [30,40,302]
println a
println b
println c