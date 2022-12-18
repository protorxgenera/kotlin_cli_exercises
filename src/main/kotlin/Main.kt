import kotlin.math.pow

fun main() {

	println("Hello World!")
	// vars()

	// arrays()

	// ifStatements()
	// forLoop()
	// whileLoop()
	// whenCase()

	// simpleFunction()
	// functionWithArgs(26, "Chris")
	// println(functionWithReturn())
	// println(functionWithArgsAndReturn(1996))

	// nullability()

	// Car().outputCar()
	// MyCar("BMW").outputCar()
	// val myNewCar = MyPrivateCar("Aston", 1996)
	// myNewCar.outputCarAge()

	// val john = Employee(0, "John", "Doe", 3)
	// println("New employee added with ID: ${john.id}")
	// println("New employee has ${john.kids} kids")
	// debugging()

	println(simpleLambdaExpression(2, 5))

}

// defining and using variables
fun vars() {
	// data types
	val firstInt: Int = 6
	println(firstInt)

	val firstDouble: Double = 7.2
	println(firstDouble)

	val firstString: String = "I am a string!"
	println(firstString)

	val firstBool = true
	println(firstBool)

	// Declaring variables that can change value - with var

	val thisIsAnInt = 74
	println("This is an int: $thisIsAnInt")

	// Declaring variables that cannot change value - with val
	val thisIsAConst = 25

}

// Declaring variables as constants - with const val
// Constants are declared outside of functions
// main difference between var, val and const val -
// var, val initialized at runtime
// const var initialized at compile time
const val MYCONST = "My Constant"

// defining, editing and using arrays
fun arrays() {

// declaration Array

	// arrays are lists of values
	// arrays have fixed allocation memory

	var arrayA = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
	var arrayB: Array<String> = emptyArray();

// declaration ArrayList

	// array lists have dynamic memory allocation

	val arrayListA = mutableListOf<Int>(1, 3, 4, 5)
	val arrayListB: ArrayList<String> = arrayListOf()
	val arrayListC = listOf<Boolean>(true, false, true) // immutable

// editing Array values

	// overwrite
	arrayA[0] = 99

	// add
	arrayA += 100
	arrayB += "FirstText"

// editing ArrayList

	// overwrite
	arrayListA[3] = 89

	// add
	arrayListB.add("testing 2")

// actions with arrays and arrayLists

	arrayA.forEach {
		println("Iterating through value $it")
	}

	arrayListC.forEachIndexed { index, value ->
		println("Currently we are at index $index and its value is $value")
	}

}

fun ifStatements() {

	println("type a number and we will check if it is even or odd")
	val number = readln().toInt()
	if (number % 2 == 0)
		println("$number is even")
	else println("$number is odd")

	println("your input will be checked for parity only if it is positive")
	val number2 = readln().toInt()
	if (number2 % 2 == 0 && number2 > 0) {
		println("$number2 is even and positive")
	} else if (number2 % 2 !== 0 && number2 > 0) {
		println("$number2 is odd and positive")
	} else println("$number2 is negative")


}

// for loops - when we want to iterate through a specific range
fun forLoop() {

	val startYear = 2000
	val endYear = 2020

	var longYearCounter = 0
	var shortYearCounter = 0

	for (i in startYear..endYear) {
		if (i % 4 == 0) {
			longYearCounter += 1
		} else {
			shortYearCounter += 1
		}
	}

	println("Between $startYear and $endYear there are $longYearCounter long years and $shortYearCounter short years")

}

// while loops - we do something as long as a condition is met
fun whileLoop() {

	var requiredPass = false

	while (!requiredPass) {

		println("Please input your password")
		val userInput = readln()

		if (userInput.length < 8) {
			println("Password must be at least 8 characters long")
		} else {
			println("Password accepted")
			requiredPass = true
		}

	}

}

// when cases - when we expect multiple inputs/values for a variable + execute a different codeblock for each value
fun whenCase() {
	val answer = false
	when (answer) {
		true -> println("The answer is true")
		false -> println("The answer is false")
	}
}

fun simpleFunction() {
	println("This is a simple function")
}

fun functionWithArgs(age: Int, name: String) {
	println("You are $name and your age is $age years old")
}

fun functionWithReturn(): String {
	return "A string"
}

fun functionWithArgsAndReturn(birthYear: Int, currentYear: Int = 2020): Int {
	return currentYear - birthYear
}

// simple lambda expression
val simpleLambdaExpression: (Int, Int) -> Int = {a: Int, b: Int -> a + b}

fun nullability() {

	val myVar: String? = "null"

	// safe call ?. - used if you don't mind that the string "null" can be returned
	val lengthOfVar = myVar?.length
	println("My string length is $lengthOfVar")

	// safe call with .let {} - let block executed only if the variable is not null -
	myVar?.let {
		println("myVar is not null, it's $it")
	}

	// Elvis operator ?:
	val myVar2 = myVar?.length ?: -1
	println(myVar2)

	// Non-null assertion operator !!
	println("The length of myVar is totally not null (I promise) and it is ${myVar!!.length}")

}

// simple class with simple method
class Car() {
	private val carModel = "Lada"
	fun outputCar() {
		println("My car model is $carModel")
	}
}

// class with primary constructor (parameters)
class MyCar(name: String) {
	private val myCar = name
	fun outputCar() {
		println("My car model is $myCar")
	}
}

// class with primary constructor and init block
class MyPrivateCar(val myCarName: String, val myCarYear: Int) {

	// the init block executes immediately after an instance of the class is created
	init {
		println("My car model is $myCarName and it was made in $myCarYear")
	}

	fun outputCarAge() {
		println("My car is ${2022 - myCarYear} years old")

	}

}

// data classes - classes used for data storing
data class Employee(val id: Int, val name: String, val surname: String, var kids: Int = 0) {}

// debugging in IDE
fun debugging() {

	val a = 100.98
	val b = 105.24
	val c = a.pow(2) / b

	val d = false
	val e = !d

	val f = "Chris"
	val g = "My name is $f"

	val h = arrayOf(1, 2, 3, 4, 5, 6, 7)
	val i = h[5]

}