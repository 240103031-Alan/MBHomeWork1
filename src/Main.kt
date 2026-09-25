fun main() {
    println(compareTimes(300, 250))
    println(compareTimes(300, 300))
    println(compareTimes(200, 220))
}

fun compareTimes(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}