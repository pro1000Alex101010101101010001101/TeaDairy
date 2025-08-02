class MenuLogic(): TeaRenderInterface {

    private val teaFactory: TeaFactory = TeaFactory
    private val teaRepository = TeaRepository
    private val teaTypes = TeaType.entries

    private fun promptForIntInRange(range: IntRange): Int? {
        var value: Int?
        do {
            val boxWidth = printInputBox("Введите вашу оценку чая")
            value = readln().toIntOrNull()
            boxBot(boxWidth)
            if ((value?:1 ) !in range) {
                println("❌ Введите число от ${range.first} до ${range.last}")
            }
        } while (value !in range)
        return value?: 1
    }

    fun createTea() {
        chooseTeaType()
        var boxWidth = printInputBox("Выберите чай: ")
        val teaTypeIndex = readln().toIntOrNull()
        boxBot(boxWidth)
        boxWidth = printInputBox("Введите название чая: ")
        val name = readln()
        boxBot(boxWidth)
        boxWidth = printInputBox("Введите год чая: ")
        val year = readln().toIntOrNull()
        boxBot(boxWidth)
        val rating = promptForIntInRange( 1..10)
        val teaType = teaTypes[(teaTypeIndex ?: 1)- 1]
        val tea = when (teaType) {
            TeaType.SHU_PUERH -> teaFactory.createTea(type = TeaType.SHU_PUERH, name = name, year = year?: 2000, rating = rating)
            TeaType.SHEN_PUERH -> teaFactory.createTea(type = TeaType.SHEN_PUERH, name = name, year = year?: 2000, rating = rating)
            TeaType.BLACK -> teaFactory.createTea(type = TeaType.BLACK, name = name, year = year?: 2000, rating = rating)
            TeaType.RED -> teaFactory.createTea(type = TeaType.RED, name = name, year = year?: 2000, rating = rating)
            TeaType.WHITE -> teaFactory.createTea(type = TeaType.WHITE, name = name, year = year?: 2000, rating = rating)
            TeaType.OOLONG -> teaFactory.createTea(type = TeaType.OOLONG, name = name, year = year?: 2000, rating = rating)
        }
       teaRepository.saveTea(tea)

    }


}