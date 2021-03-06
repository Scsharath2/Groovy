package com.test.demo

//LIST
//It's a structure to store collection of data items
def fruits = ["Apples","Oranges","Grapes"]
// Lists are indexed which starts from 0

println fruits[1] //returns Oranges
println fruits.get(2)

def myList = [1,2,3,['A','B',"Groovy"],4]
println myList[2] // it returns 3
println myList[3][2] //Here the output is Groovy because list index is 3 and inside the list
// the index of groovy is 2
println myList.get(3).get(2) // Again it return Groovy.
println myList[0..2] //here it return the list from index 0 to 2
println myList.contains(2) //here it returns true since 2 is in our list
println myList[3].contains("Groovy") //here need to mention the index of the list to look inside list
println myList.size() //prints number os elements
myList.add(10) //add number to the list
println myList

myList<<20
println myList //prints elements from the list which is lesser than 20
myList.add(2,33) // this will add element at index position 2
println myList
myList.remove(2) // to remove the element at index position 2
println myList

myList = myList + [30,20] // adds number to the list
println myList

myList = myList.plus([50]) //add number to the list
println myList

myList = myList-[30,20] //removes number from the list
println myList

myList = myList.minus([50])
println myList

myList.pop() //removes first item
println myList

myList.removeLast() //removes last item
println myList

println myList.intersect([1,2,3]) //it will return elements only which are matching with myList
mylist = myList.reverse() //print reverse list
println myList

myList = myList.sort()
println myList // prints elements with sorted

println myList.isEmpty() //return false because we've elements
println myList.clear() //to Clear the list
println myList.isEmpty() //return true list is cleared.



