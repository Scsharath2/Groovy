package com.test.demo
//http://groovy-lang.org/syntax.html#all-strings
//Strings, different ways to mention string
// Single Quote '.....'
// Double Quote "....."
// triple single Quote '''.....'''
//triple double quoted """...."""
// Slash /.../
// dollar slash $/..binding./$

def name = "dwight"
println name
println "My name is " + name
println "My name is ".concat(name)
println "My name is ${name}"
println "My name is $name"
println 'My name is $name' //this doesn't display the name.This feature is called interpolation
// Interpolation cannot be done in single quoted strings

//To print the multi-lines , use triple single or double quotes.binding
def s1 = ''' ACCDFDFDFD
dfdfdfdf'''
println s1
println name.length()
println name[-2] //it will print the character at index position -2
println name.indexOf('g') //it will print the index position of character g
println name[0..2] //it will print all the characters starting from index position 0 to 2
println name[5..3] //it will print all the characters starting from index position from 5 to 3 which is backward
println name[0,2,4] //it will print all the characters of index position 0,2,4

println name.substring(2) //it will print the string starting from index position 2
println name.subSequence(1, 4) // it will print the string starting from index 1 to 4


def str = "This is groovy script"

println str.split(" ") //here the escape character is space meaning split
// operation will be done based on space , the string is converted to a list

println str-("groovy") // groovy will be removed from the string
println str.replace("script","lang.") // will replace the script with lang. in the string


//converting the case
println str.toLowerCase()
println str.toUpperCase()


//every character is add to list of a string
println str.toList()

//to repeat the string 
println "Groovy" *3 

println "Abc".equals("Abc") //prints True 
println "Abc".equals("abc") //prints false as Groovy is case sensitive
println "Abc".equalsIgnoreCase("abv") //prints true because here case is ignored

// Slash -  /.../
def name1="Michal"
def s11 = /a green sky $name1/
def s22 =  $/a blue sky $name/$

println s11
println s22

// slash and dollar slash quotes are mainly used while using regular expression










 
