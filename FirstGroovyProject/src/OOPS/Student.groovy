package OOPS
//Class is blue print of multiple objects
class Student {
	String name;
	int sub1Marks;
	int sub2Marks;
	
	def printTotal() {
		println "$name has total marks = "+(sub1Marks+sub2Marks)
	}

	static void main(args) {
		// TODO Auto-generated method stub
		Student Student1 = new Student()
		Student1.name = "Pam"
		Student1.sub1Marks = 99
		Student1.sub2Marks = 98
		Student1.printTotal()
		
		Student Student2 = new Student()
		Student2.name = "Jim"
		Student2.sub1Marks = 95
		Student2.sub2Marks = 90
		Student2.printTotal()
	}
}
