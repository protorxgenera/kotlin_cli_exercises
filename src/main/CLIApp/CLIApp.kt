fun main() {

	val currentPlayer = Lottery(inputHandle()).determineIfWon()
	outputHandler(currentPlayer)

}

/**
 * Greets user
 * Reads user input
 * Validates user input
 * @return Player class with user's entered data
 */
fun inputHandle(): Player {
	// store temporary name and temporary prediction
	var tempName: String? = null
	var tempPrediction: String? = null

	// data validation variable
	var dataValid = false

	println("This is a lottery, if you guess the correct number between 0 and 9, you will win")
	println()

	while (!dataValid) {

		print("Please enter your name > ")
		tempName = readln()
		print("Please enter your prediction > ")
		tempPrediction = readln()

		// validate that input is not empty
		if (tempName == "" || tempPrediction == "") {
			println("Please enter the required data")
			continue
		}

		// validate that prediction is in range
		if (tempPrediction.toInt() > 9 || tempPrediction.toInt() < 0) {
			println("Please enter prediction in given range")
			continue
		} else {
			dataValid = true
		}

	}

	// return user data in Player class
	return Player(tempName!!, tempPrediction!!.toInt())

}

/**
 * Takes [ourPlayer] variable
 * Outputs results to user
 */
fun outputHandler(ourPlayer: Player) {
	println()
	System.out.printf("%-10s%-15s%-20s%-15s\n", "NAME", "PREDICTION", "RANDOM NUMBER", "USER WON?")
	System.out.printf(
		"%-10s%-15s%-20s%-15s\n",
		ourPlayer.name,
		ourPlayer.predictedNumber,
		ourPlayer.randomNumber,
		ourPlayer.userWon
	)
}