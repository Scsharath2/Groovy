package com.test.demo

//Regex -patterns used to find substring in a text
// in groovy, we use ~"Expression"
//https://regexr.com/
//https://www.regextester.com/

def match =  "Groovy" =~ "Groovy"

if(match) {
	println match[0]
}else {
	println "No Match found"
}


//what if we've more than1 match, in letter groovy we've 2 O

def match1 =  "Groovy" =~ "o"
if(match1) {
	def i = 0
	while(match1) {
	println match1[i]
	i++
	}
	
}