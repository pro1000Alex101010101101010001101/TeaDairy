class MenuController(
    private val teaMenuRender: TeaMenuRender = TeaMenuRender(),
    private val menuLogic: MenuLogic = MenuLogic(teaFactory = TeaFactory)
) {
    fun start() {
        while (true) {
            teaMenuRender.showMainMenu()

            when (readln()) {
                "1" -> menuLogic.createTea()
                "2" -> TODO()
                "3" -> TODO()
                "4" -> return
                else -> println("Неверный ввод")
            }
        }
    }
}