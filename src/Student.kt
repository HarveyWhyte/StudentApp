import kotlin.ranges.contains

abstract class Student (val id: String, val name: String, val course: String) {
    override fun toString() : String {
        return "Name: $name, Course: $course, Mark: $mark, Grade: ${getGrade()}, Passed: ${didPass()}"
    }
    var mark = 0.0
        set(newMark){
            if(newMark >= 0 && newMark <= 100){
                field = newMark
            }
        }

    abstract fun getGrade() : String

    public fun didPass() : Boolean{
        if(mark < 40)
            return false
        return true
    }
}