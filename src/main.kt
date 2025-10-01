fun main() {
    val id = 0
    var loop = true
    var students = arrayListOf<Student>()
    while (loop) {
        println("Enter Name: ")
        val name = readln()
        println("Enter Course: ")
        val course = readln()
        println("Enter Mark: ")
        val mark = readln().toDouble()
        val student = Student(id.toString(), name, course)
        student.mark = mark
        students.add(student)
        for (student in students) {
            println(student.toString())
        }
    }
}