class TeaMenuRender {
    private val yellow = "\u001B[33m"
    private val reset = "\u001B[0m"

    fun showMainMenu(){
        renderMainMenu()
    }

    private fun renderMainMenu() {
        println("""
        $yellow╔════════════════════════════════════╗
        ║       🍵 ЧАЙНЫЙ ДНЕВНИК 🍵     ║
        ╟────────────────────────────────╢
        ║  1. Добавить новый чай         ║
        ║  2. Просмотреть коллекцию      ║
        ║  3. История и информация о чае ║
        ║  4. Выход                      ║
        ╚════════════════════════════════════╝$reset
        """.trimIndent())
    }


}