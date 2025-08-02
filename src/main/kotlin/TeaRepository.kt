import java.io.File
import kotlinx.serialization.json.*

object TeaRepository: TeaRenderInterface {

    private val listOfTeasFile = File("List_of_teas.json")

    private val _teas = loadTeaFromFile()
    val teas
        get() = _teas.toList()

    private fun loadTeaFromFile(): MutableSet<Tea> {
        if (!listOfTeasFile.exists()) return mutableSetOf()

        val json = listOfTeasFile.readText()
        return try {
            Json.decodeFromString<Set<Tea>>(json).toMutableSet()
        } catch (e: Exception) {
            println("Ошибка чтения JSON: ${e.message}")
            mutableSetOf()
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

    fun showAllTeas() {
        for ((index, tea) in _teas.withIndex()) {
            val boxWidth = printInputBox("Чай номер №${index + 1}\n")
            tea.printInfo()
            boxBot(boxWidth)
        }
    }

    fun deleteTea() {
        var boxWidth = printInputBox("Укажите Id чая:")
        val id = readln().toInt()
        boxBot(boxWidth)

        for (tea in _teas) {
            if (tea.id == id) {
                _teas.remove(tea)
            }
        }
        boxWidth = printInputBox("THE TEA HAS BEEN DELETED\n")
        boxBot(boxWidth)
    }
}