import scala.math._

// Object vs class
object Hamilton {
    // Take in input the number of winning tickets
    // Take in input the number of entrants
    // Compute the probability of winning
    // Compute the estimated number of times that one has to play in order to have 99% of winning chance
    // Run the lottery simulation
    // Show the number of attempts tried before winning
    def main(args: Array[String]) = {
        // Read String and parse it to Int
        var tickets: Int = scala.io.StdIn.readLine().toInt;
        var entrants: Int = scala.io.StdIn.readLine().toInt;
        var winningChance: Double = tickets.toDouble / entrants;
        var nnPercent: Double = (log(0.01) / log(1 - winningChance)).floor;
        // Get a random instance
        val rand = new scala.util.Random;
        var counter: Int = 1;
        while(rand.nextInt(entrants / tickets) != 0){
            counter += 1;
        }
        println("You won!");
        println(s"You played $counter times");
        println(s"The number of entrants is $entrants");
        println(s"Your winning chance is $winningChance");
        println(s"You have to play around $nnPercent times to have 99% chance of winning");
    }
}