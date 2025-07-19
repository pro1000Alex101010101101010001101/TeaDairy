import kotlinx.serialization.*
private const val cyan = "\u001B[36m"
private const val reset = "\u001B[0m"
private const val DELIMITERS = "\n"

@Serializable
data class Tea(
    val id: Int,
    val type: TeaType,
    val name: String,
    val year: Int,
    val rating: Int,

) {

    fun printInfo(){
        println(this)
    }

    override fun toString(): String {
        return "${cyan}Id: $id${DELIMITERS}Type: $type${DELIMITERS}Name: $name${DELIMITERS}Year: $year${DELIMITERS}Rating $rating/10$reset"
    }
}