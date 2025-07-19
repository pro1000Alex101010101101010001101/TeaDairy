import java.io.File
import kotlinx.serialization.*
import kotlinx.serialization.json.*

object TeaRepository {

    private val listOfTeasFile = File("List_of_teas.json")

    private val _teas = loadTeaFromFile()
    val teas
        get() = _teas.toList()

    private fun loadTeaFromFile(): MutableList<Tea> {
        if (!listOfTeasFile.exists()) return mutableListOf()

        val json = listOfTeasFile.readText()
        return try {
            Json.decodeFromString<List<Tea>>(json).toMutableList()
        } catch (e: Exception) {
            println("Ошибка чтения JSON: ${e.message}")
            mutableListOf()
        }
    }

    fun saveTea(tea: Tea) {
        _teas.add(tea)
    }

    private fun saveTeaToFile() {
        val json = Json.encodeToString(_teas)
        listOfTeasFile.writeText(json)
    }

    fun saveChanges() {
        saveTeaToFile()
    }
}