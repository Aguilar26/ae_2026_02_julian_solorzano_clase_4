/*** Este es un comentario multilínea de función ***/
// Kotlin es un lenguaje Fuerte y Estáticamente Tipado
// SIEMPRE TIPAR VARIABLES //
// POO

data class Student( 
    val id: Long,  
    val name: String,
    val email: String
)

fun main() {
    val student = Student(
        id = 1, 
        name = "Ana",
        email = "ana@gmail.com"
    )
    println(student)
}