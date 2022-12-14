data class Player(
	var name: String,
	var predictedNumber: Int,
	var randomNumber: Int = 0,
	var userWon: Boolean = false
)