package com.test.demo

File myFile = new File("Data12.txt")
myFile.write("This is Line 1")
myFile << "\nThis is line2"
//myFile.text = "This is Line3" //This will overwrite all the content in text file
myFile.withWriter { writer ->
	writer.writeLine("This is Line 4")
}

myFile.append("This is Line 5")

println myFile.length() //Prints the file length
println myFile.text //displays the text of file
println myFile.isDirectory() //will return true if it's directory
println myFile.isFile() //will return true if it's a file
println myFile.isHidden() //will return true if it's hidden

def newFile = new File("data122.txt")
newFile << myFile.text // copy contents to a new file
myFile.bytes = [] //will delete contents of file

//myFile.renameTo(new File("newFile.txt")) rename file
myFile.delete() //delete the file