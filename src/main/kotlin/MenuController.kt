class MenuController(
    private val teaMenuRender: TeaMenuRender = TeaMenuRender()
) {
    fun start() {
        teaMenuRender.showMainMenu()

        while (true) {


            when (readln()) {
                "1" -> TODO()
                "2" -> TODO()
                "3" -> TODO()
                "4" -> return
                else -> println("Неверный ввод")
            }
        }
    }
}