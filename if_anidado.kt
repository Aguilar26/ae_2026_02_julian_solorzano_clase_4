/*** Este es un comentario multilínea de función ***/
// Kotlin es un lenguaje Fuerte y Estáticamente Tipado
// SIEMPRE TIPAR VARIABLES //
// POO

data class Student( 
    val id: Long,  
    val name: String,
    val email: String, 
    val grade: Int,   
    val isActive: Boolean
)

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
    
    // Corrección del IF como expresión (asignación directa)
    val status: String = if (student.isActive) {
        "Activo"
    } else {
        "Inactivo"
    }
    
    println("Estado del estudiante: $status")
}