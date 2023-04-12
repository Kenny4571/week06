import java.util.Random

fun main() {
    println("Welcome to the Magic 8 Ball!")

    // List of responses
    val responses = arrayOf("Yes, of course!", "Without a doubt, yes.", "You can count on it.",
        "For sure!", "Ask me later.", "I'm not sure.", "I can't tell you right now. I'll tell you after my nap.",
        "No way!", "I don't think so.", "Without a doubt, no.", "The answer is clearly NO.")

    // Loop until user quits
    while (true) {
        println("Please enter a yes/no question:")
        // Read user input
        readln()

        // Generate random number
        val randomNumber = Random().nextInt(responses.size)

        // Display response
        println("Magic 8 Ball says: ${responses[randomNumber]}")

        // Ask if user wants to quit
        println("Do you want to ask another question? (y/n)")
        val continuePlaying = readln()
        if(continuePlaying == "n") {
            break
        }
    }
}
