import kotlinx.serialization.*

@Serializable
data class Tea(
    val type: TeaType,
    val name: String,
    val year: Int,
    val rating: Int,

) {
    fun tellMeAboutTea(){

    }
}