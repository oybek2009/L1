import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    print("birinchi sonni kiriting: ")
    val a = scanner.nextInt()
    print("ikkinchi sonni kiriting: ")
    val b = scanner.nextInt()
    print("uchinchi sonni kiriting: ")
    val c = scanner.nextInt()

    if (a == b) {
        println("bor")
    }
    else if (b==a) {
        println("bor")
    }
    else if (c==a) {
        println("bor")
    }
}
