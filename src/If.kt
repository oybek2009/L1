import java.util.Scanner

fun main() {

    val scanner = Scanner (System.`in`)
    print("birinchi sonni kiriting: ")
    val a = scanner.nextInt()
    print("ikkinchi sonni kiriting: ")
    val b = scanner.nextInt()
    print("uchinchi sonni kiriting: ")
    val c = scanner.nextInt()

    if (a>b&&a>c) {
        println(a)
    }
    else if (b>a&&b>c) {
        println(b)

    }
    else if (c>a&&c>b) {
        println(c)
    }
}