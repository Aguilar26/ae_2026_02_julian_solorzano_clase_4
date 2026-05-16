/*** Este es un comentario multilínea de función ***/
// Kotlin es un lenguaje Fuerte y Estáticamente Tipado
// SIEMPRE TIPAR VARIABLES //
// POO

/// Julian Solórzano - Clase 4 ///

data class Student( 
    val id: Long,  
    val name: String,
    val email: String, 
    val grade: Int,   
    val isActive: Boolean
)

fun getStudentResult(student: Student): String {
    return when (student.grade) {
        in 9..10 -> "Sobresaliente"
        in 7..8 -> "APROBADO"
        in 0..6 -> "Reprobado"
        else -> "Nota Invalida"
    }
}

fun main() {
    val student = Student(
        id = 1L, 
        name = "Ana",
        email = "ana@gmail.com",
        grade = 8, 
        isActive = true
    )
    
    println(student)
    
    if (student.isActive) {
        println("El estudiante ${student.name} esta activo")
    } else { 
        println("El estudiante ${student.name} no esta activo ")
    }
    
    val status: String = if (student.isActive) {
        "Activo"
    } else {
        "Inactivo"
    }
    
    println("Estado del estudiante: $status")
    
    val student2 = Student(
        id = 2L, 
        name = "Andres",
        email = "anda@gmail.com",
        grade = 10, 
        isActive = true
    )
    
    val student3 = Student(
        id = 3L, 
        name = "Aguilar",
        email = "ana@gmail.com",
        grade = 9, 
        isActive = false
    )
    
    val students = listOf(student, student2, student3)
    println(students)
    
    for (student in students) {
        val result = getStudentResult(student)
        
        if (student.isActive) {
            
            println("${student.name} - ${student.grade} - $result")
        }
        
        println("${student.name}: $result")
    } 
}