class Undergraduate(id: String, name: String, course: String) : Student(id, name, course) {
    override fun getGrade(): String {
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