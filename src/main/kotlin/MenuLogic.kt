class MenuLogic(): ChoosingTea {

    private val teaFactory: TeaFactory = TeaFactory
    private val teaRepository = TeaRepository
    private val teaTypes = TeaType.entries

    fun createTea() {
        chooseTeaType()
        val boxWidth = printInputBox("Введите номер чая")
        val teaTypeIndex = readln().toIntOrNull()
        boxBot(boxWidth)



//        teaRepository.saveTea(tea)
    }
}