fun main() {

	// val lambdaFunction: (String, Int) -> Unit = {string: String, int: Int -> codeblock}

	/**
	 *  The following example is a combination of anonymous functions and a lambda expression
	 * 	A lambda expression is a function inside braces, is stored in a variable and has variable-notation
	 *
	 * 	val instead of fun
	 * 	name used to identify and call the function - the lambda expression is called with the name of the variable, just as a normal function would be (so nameOfFunction(parameters))
	 * 	type of function - instead of variableName: Int/String/Boolean, we have variableName: (argumentType, argumentType) -> returnType
	 * 	equal sign (as opposed to a space)
	 * 	{variable: argumentType, variable: argumentType -> code-block that returns returnType}
	 * 	the type can be inferred, so the main difference is that the arguments of the function are written inside the curly braces + the arrow sign ->
	 */

	lineLogger {
		println("This is really nice boy")
		println("I git it amigo")
	}

}

fun lineLogger(block: () -> Unit) {

	repeat(3) { println("_____________") }
	block()
	repeat(3) { println("_____________") }

}
