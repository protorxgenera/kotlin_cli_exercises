fun main() {

	/**
	 * User input
	 */
	// greeting()
	// inputHandlerLambda(userInput(), listGenerator())

	/**
	 * Test with all numbers
	 */
	val list = listGenerator()
	for (i in list) {
		inputHandlerLambda(i, listGenerator())
	}
}

fun greeting() {
	println("Binary search v01\n")
	print("Please enter an even number between 0 and 100 > ")
}

/* Instructions
Begin with the mid element of the whole array as a search key.
	If the value of the search key is equal to the item then return an index of the search key.
	Or if the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half.
	Otherwise, narrow it to the upper half.
Repeatedly check from the second point until the value is found or the interval is empty.
 */

val inputHandlerLambda: (Int?, List<Int>) -> Unit = { input: Int?, list: List<Int> ->
	var steps = 1
	var inputMatch = false
	var high = list.size
	var mid = high / 2
	var low = 0

	if (input != null) {
		while (!inputMatch) {
			if (input == list[mid]) {
				inputMatch = true
			} else if (input > list[mid]) {
				low = mid
				mid = (high + low) / 2
				steps++
			} else {
				high = mid
				mid = (high + low) / 2
				steps++
			}
		}
	}

	println("The input number $input was found in $steps step(s) and has the index of $mid")
}

fun userInput(): Int? {
	var input: Int? = null
	var inputIsEven = false

	while (!inputIsEven) {
		try {
			input = readln().toInt()
		} catch (e: NumberFormatException) {
			print("Your input is not a number, try again > ")
			continue
		}

		if ((input % 2) == 0) {
			inputIsEven = true
			continue
		} else {
			print("Your number is not even, please try again > ")
		}
	}
	return input
}

fun listGenerator(): List<Int> {
	return (0..100).toList().filter { it % 2 == 0 }
}
