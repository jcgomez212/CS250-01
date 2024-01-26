class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    var playCount: Int
) {
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printSongDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}

fun main() {
    // Example usage:
    val song1 = Song("What Was I Made For?", "Billie Eilish", 2023, 1200)
    val song2 = Song("Snooze", "SZA", 2022, 800)

    // Printing song descriptions
    song1.printSongDescription()
    song2.printSongDescription()

    // Checking popularity
    println("${song1.title} is popular: ${song1.isPopular}")
    println("${song2.title} is popular: ${song2.isPopular}")
}
