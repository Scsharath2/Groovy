package com.test.demo


// Maps
// It's a key:value pair
// [key.value]

def employee = [name:'Michal', 'Age':40]
println employee
println employee.name //prints name value
println employee['name'] //again prints name value
println employee.get('Age') //prints age
println employee.getAt('Age') //prints age

println employee.size() //return 2 since map has 2 key value pairs
employee.put('city', 'scranton') // add key value pair to the map
println employee

println employee.containsKey('city') //returns true since map has key city
println employee.containsValue('paris') //returns false since map doesn't have the value Paris

println employee.getClass() 

def emp2 = employee.clone() //this will clone the employee map
println emp2 

employee.forEach { key, value -> 
	println "$key:$value"
} //here we're using closures, prints key value pairs

employee.eachWithIndex { key,value,i ->
	println "$i | $key : $value"
} //print with index

employee.eachWithIndex{ entry,i ->
	println "$i | $entry.key : $entry.value"
}

employee.clear()
println employee //clears the map
