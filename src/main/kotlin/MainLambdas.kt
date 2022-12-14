fun main() {

	// val lambdaFunction: (String, Int) -> Unit = {string: String, int: Int -> codeblock}
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
