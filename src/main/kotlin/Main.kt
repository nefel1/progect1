fun main() {
    println("ведите последовательность символов")
    val r = readln()
    var current = r[0]
    var count = 1
    var itog = ""
    for (item in r.substring(1)) {
        if (current == item) {
            count++
        } else {
            if (count == 1) {
                itog += current
            } else {
                itog += "$current$count"
            }
            count = 1
            current = item
        }
    }

    if (count == 1) {
        itog += current
    } else {
        itog += "$current$count"
    }
    println("$itog")


}