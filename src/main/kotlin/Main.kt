fun main() {

	// input > n numbers into input, the first number is n
	// 1..n numbers into an array
	// app checks if the array is in ascending order
		// if yes, print YES
		// if not, print NO

	val index = readln().toInt()
	val numberArray = mutableListOf<Int>()
	repeat(index) {
		numberArray.add(readln().toInt())
	}
	var checkIfAscending = true

	for (i in 0 until index - 1) {
		if (numberArray[i] < numberArray[i + 1]) {
			continue
		} else {
			checkIfAscending = false
			break
		}
	}

	println(if (checkIfAscending) "YES" else "NO")

}