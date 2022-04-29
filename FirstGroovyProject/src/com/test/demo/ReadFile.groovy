package com.test.demo

// It's always recommended to use single forward slash in filepath, it will work in linux and Mac
/**reading file path**/
String filePath = "C:/Users/SGAJJELA/OneDrive - AMDOCS/Backup Folders/Desktop/DevOps/Groovy/FirstGroovyProject/data1.txt"
File myFile = new File(filePath) //for Class File creating a object myFile

//reading entire content as String
println myFile.text

//Collect lines into a list
def list = myFile.collect{ it }
println "list : $list"


//store file content in an array
def array = myFile as String[]
println "array : $array"

//read file into a list of string
//readlines is another function in to a list of string
def lines = myFile.readLines()
println "line : $lines"


//read file line by line
myFile.eachLine { line -> println "line : $line" }

//read file line by line with line no
def lineNoRange = 2..4
def lineList = []
myFile.eachLine { line,lineNo -> 
	if(lineNoRange.contains(lineNo)) {
		lineList.add(line)}}
println "LineList : $lineList"


//read with reader
def line
myFile.withReader { reader ->
	while((line = reader.readLine()) != null)
	println "line : $line"
}

//reading with new reader, this function doesn't close the file after reading. Other functions
// Closes file by default
def outputfile = "data2.txt"
def reader =  myFile.newReader()
new File(outputfile).append(reader)
reader.close()


//when working with binary files, read content as bytes

byte[] contents = myFile.bytes
println contents

//size in bytes
println myFile.length()

//check if it is a file or dir

println myFile.isFile()
println myFile.isDirectory()

//get list of files from a dir
new File("C:/").eachFile{
	files -> println files.getAbsolutePath()
	
}

//recursively display all files in a dir & its sub dir

new File("C:/Users/SGAJJELA/OneDrive - AMDOCS/Backup Folders/Desktop/DevOps").eachFileRecurse { 
	files -> println files.getAbsolutePath()
}

//Copy file data to another file
def newFile = new File("data3.txt")
newFile << myFile.text

//delete file
newFile.delete()