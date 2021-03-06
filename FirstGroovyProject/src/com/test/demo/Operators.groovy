package com.test.demo

//Arithmetic operators -http://docs.groovy-lang.org/latest/html/documentation/core-operators.html
//assert statement returns true if the left hand and right hand side are equal
///There will be output only if there any failure
assert  1  + 2 == 3
assert  4  - 3 == 1
assert  3  * 5 == 15
assert  3  / 2 == 1.5
assert 10  % 3 == 1
assert  2 ** 3 == 8

assert 9.intdiv(5) == 1
assert 2.2.plus(1.1) == 3.3

//Unary operators

assert +3 == 3
assert -4 ==  - 4
assert -(-1) == 1

//Increment ++ & Decrement -- operators
int i =10
println i++// here it shows 10 but i got increased. So will print i again
println i

// Assignment arithmetic operators
def a = 4
a += 3
assert a == 7

def b = 5
b -= 3
assert b == 2

def c = 5
c *= 3
assert c == 15

def d = 10
d /= 2
assert d == 5

def e = 10
e %= 3
assert e == 1

def f = 3
f **= 2
assert f == 9

//Relational operators
assert 1 + 2 == 3
assert 3 != 4

assert -2 < 3
assert 2 <= 2
assert 3 <= 4

assert 5 > 1
assert 5 >= -2

//Logical operators
assert !false // "not" false is true
assert true && true //true "and" true is true
assert true || false //	true "or" false is true

assert (!false && false) == false //  logical "not" has a higher priority than the logical "and"
assert true || true && false //  logical "and" has a higher priority than the logical "or"

//Bitwise operators
int j =20
int g = 25
//here the output is 16, because the calculation is done by converting them into
		//binary format. let's see
println Integer.toBinaryString(20) //10100
println Integer.toBinaryString(25) // 11001
//print (j & g) // 10000 let's test it
println Integer.parseInt("10000",2)


//Conditional operators
assert (!true)    == false // the negation of true is false
assert (!'foo')   == false //'foo' is a non-empty string, evaluating to true, so negation returns false
assert (!'')      == true // '' is an empty string, evaluating to false, so negation returns true
		
//Ternary operator
def output1 = (1>2) ? "1 is greater" : "1 is not greater"
println output1