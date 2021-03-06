package com.test.demo

//for

for(int i=1;i<=5;i++) {
	println i
}


int i =1
for(i;i<=5;i++) {
	println i
}

//for in
for(a in 1..5){
	println a
}

//In Groovy there are some keywords,let see examples below
1.upto(5) {	println "$it"}
5.times { println "$it" }

//here step keyword is used to increase the step count, increase the value from 1 to 10 by 
//step count of 2 on every iteration
1.step(10, 2) { println "$it" }

//Can also use list with for loop, below example.binding It goes to every element and prints it

for (b in [0,1,2,3,4,5]) {
	println b
}

// Can iterate over a map
def map = ['name':"Groovy",'subject':"Dev"]
x=0
for (e in map) {
	println e.key +":" //Prints the key of map
	println e.value //Prints the value of map 
}

//while loops
int c =1

while(c<=5) {
	println c
	c = c+1
}


