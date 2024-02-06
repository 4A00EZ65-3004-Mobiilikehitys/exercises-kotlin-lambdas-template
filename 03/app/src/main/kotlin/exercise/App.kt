package exercise


/**
 * Main function to simulate the lotto number match.
 * Takes user input, validates it, and compares against randomly generated lotto numbers.
 */
fun main(args: Array<String>) {
    // checkIfValidLottoNumbers is a class extension:
    // -> https://www.geeksforgeeks.org/kotlin-extension-function/
    val userLotto = args.checkIfValidLottoNumbers()
    if (userLotto == null) {
        println("Please give valid input. Give seven unique numbers between 1 - 40.")
        return
    }
    var continueCalculation = true
    var highscore = 0
    var weeks = 0.0
    while (continueCalculation) {
        val randomLotto = generateRandomLotto()
        // you can comment away these when testing. Can
        // get slow.
        // logger.debug(randomLotto.addPadding(2))
        // logger.debug(userLotto.addPadding(2))

        val amountOfCorrectLottoNumbers = userLotto.howMany(randomLotto)

        if (amountOfCorrectLottoNumbers > highscore) {
            highscore = amountOfCorrectLottoNumbers
            val formattedTime = formatTime(weeks)
            logger.info("You got $highscore correct, it took $formattedTime!")
        }
        weeks++
        continueCalculation = amountOfCorrectLottoNumbers < 7
    }
}
