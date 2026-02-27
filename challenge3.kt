//Challenge 3: Safe University Portal (Null Safety)

fun printStudentDetails(name: String?, studentNumber: String?) {
    if (name != null && studentNumber != null) {
        println("Welcome $name! Your student number is $studentNumber.")
    } else {
        println("Incomplete record: missing name or student number.")
    }
}