class MenuController(
    private val teaMenuRender: TeaMenuRender = TeaMenuRender(),
    private val menuLogic: MenuLogic = MenuLogic(),
    private val teaRepository: TeaRepository = TeaRepository
): TeaRenderInterface {
    fun start() {
        while (true) {
            teaMenuRender.showMainMenu()
            val boxWidth = printInputBox("Выберите действие:")
            val input = readln().toIntOrNull()
            boxBot(boxWidth)

            when (input?: -1) {
                1 -> menuLogic.createTea()
                2 -> teaRepository.showAllTeas()
                3 -> teaRepository.deleteTea()
                4 -> TODO()
                5 -> {
                    teaRepository.saveChanges()
                    return
                }
                else -> println("Неверный ввод")
            }
        }
    }
}