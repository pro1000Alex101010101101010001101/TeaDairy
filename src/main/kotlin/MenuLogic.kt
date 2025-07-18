class MenuLogic(private val teaFactory: TeaFactory): ChoosingTea {

    private val teaRepository = TeaRepository

    fun createTea() {
        chooseTeaType()
//        teaRepository.saveTea(tea)
    }
}