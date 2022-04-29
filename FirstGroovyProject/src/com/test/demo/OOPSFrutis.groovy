package com.test.demo

class OOPSFrutis {
	private String furitName
	private String fruitColor
	
	def setFruitName(String name) {
		furitName = name
	}
	def setFruitColor(String color) {
		fruitColor = color
	}
	def getFruitName(){
		println "FruitName is $furitName"
	}
	def getFruitColor(){
		println "FruitColor is $fruitColor"
	}

	static void main(args) {
		OOPSFrutis Fruit = new OOPSFrutis()
		Fruit.setFruitName("Apple")
		Fruit.setFruitColor("Red")
		Fruit.getFruitName()
		Fruit.getFruitColor()

		
	}
}
