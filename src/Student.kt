import kotlin.ranges.contains

class Student (val id: String, val name: String, val course: String, val markIn: Double) {
    override fun toString() : String {
        return "Name: $name, Course: $course, Mark: $mark"
    }
    var mark = 0.0
        set(newMark){
            if(newMark >= 0 && newMark <= 100){
                field = newMark
            }
        }

    init {
        mark = markIn
    }
    public fun getGrade() : String{
        val grade = when(mark){
            in 70.0..100.0 -> "First"
            in 60.0..69.0 -> "2/1"
            in 50.0..59.0 -> "2/2"
            in 40.0..49.0 -> "Third"
            in 0.0..39.0 -> "Fail"
            else -> "percentage must be between 0 and 100"
        }
        return grade
    }
}