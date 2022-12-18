fun main() {

	// val lambdaFunction: (String, Int) -> Unit = {string: String, int: Int -> codeblock}
	/**
	 * 	A lambda expression is stored in a variable and has variable-notation
	 *
	 * 	val instead of fun
	 * 	name used to identify and call the function - the lambda expression is called with the name of the variable, just as a normal function would be (so nameOfFunction(parameters)
	 *
	 */

	lineLogger {
		println("This is really nice boy")
		println("I get it amigo")
	}

}

fun lineLogger(block: () -> Unit) {

	repeat(3) { println("_____________") }
	block()
	repeat(3) { println("_____________") }

}
