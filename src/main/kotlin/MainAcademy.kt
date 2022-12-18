fun main() {

	// a program that reads *four* characters and checks for each character whether it is a digit
	// the program must print either true or false for each character in a new line

	val list = (1..10).toList()
	println(list)

	repeat(1) {
		val input: Char = readln().first()
		println(input.isDigit())
	}


}