class Lottery(var ourPlayer: Player) {

	/**
	 * @return random number from 0..9
	 */
	private fun generateRandomNumber(): Int {
		return (0..9).random()
	}

	/**
	 * Compares prediction with random number
	 * @return Player class with full info
	 */
	fun determineIfWon(): Player {
		ourPlayer.randomNumber = generateRandomNumber()
		if (ourPlayer.randomNumber == ourPlayer.predictedNumber) {
			ourPlayer.userWon = true
		}
		return ourPlayer
	}

}