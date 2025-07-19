class MenuController(
    private val teaMenuRender: TeaMenuRender = TeaMenuRender(),
    private val menuLogic: MenuLogic = MenuLogic(),
    private val teaRepository: TeaRepository = TeaRepository
): ChoosingTeaInterface {
    fun start() {
        while (true) {
            teaMenuRender.showMainMenu()
            val boxWidth = printInputBox()
            val input = readln()
            boxBot(boxWidth)

            when (input) {
                "1" -> menuLogic.createTea()
                "2" -> teaRepository.showAllTeas()
                "3" -> TODO()
                "4" -> TODO()
                "5" -> {
                    teaRepository.saveChanges()
                    return
                }
                else -> println("Неверный ввод")
            }
        }
    }
}