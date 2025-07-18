import java.io.File

object TeaRepository {

    private val listOfTeas = File("List_of_teas.json")

    private val _teas = loadTeaFromFile()
    val teas
        get() = _teas.toList()

    private fun loadTeaFromFile(): MutableList<Tea> {
        val teas: MutableList<Tea> = mutableListOf()
        return teas
    }

    fun saveTea(tea: Tea) {
        _teas.add(tea)
    }
}