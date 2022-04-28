import java.lang.System
import java.util.Scanner
val taskList = mutableListOf<String>()
val scanner = Scanner(System.`in`)
fun add() {
    println("Input a new task (enter a blank line to end): ")
    var newTask = ""

    while (true) {
        val task = scanner.nextLine().strip()
        if (task == "") {
            break
        } else {
            newTask += task + "\n"
        }
    }
    if (newTask == "") {
        println("The task is blank")
    } else {
        taskList.add(newTask)
    }
}
fun print() {
    if (taskList.size == 0) {
        println("No tasks have been input")
    } else {
        for ((number, task) in taskList.withIndex()) {
            val stringList = task.split("\n")

            if (number < 9) {
                println("${number + 1}  ${stringList[0]}")

            } else {
                println("${number + 1} ${stringList[0]}")
            }

            for (i in 1..stringList.lastIndex) {
                println("   ${stringList[i]}")
            }
            println("\n\n")
        }
    }
}
fun main() {
    while (true) {
        println("Input an action (add, print, end): ")
        when (scanner.nextLine().strip()) {
            "add" -> {
                add()
            }
            "print" -> {
                print()
            }
            "end" -> {
                println("Tasklist exiting!")
                break
            }
            else -> println("The input action is invalid")
        }
    }
}