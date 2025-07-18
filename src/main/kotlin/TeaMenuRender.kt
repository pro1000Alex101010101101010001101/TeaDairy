class TeaMenuRender {
    private val yellow = "\u001B[33m"
    private val cyan = "\u001B[36m"
    private val green = "\u001B[32m"
    private val reset = "\u001B[0m"

    fun showMainMenu() {
        println("\n")
        println(
            """
$cyan╭────────────────────────────────────────╮
│        ${yellow}🍵 ЧАЙНЫЙ ДНЕВНИК 🍵$cyan        │
├────────────────────────────────────────┤
│ ${green}[1]$cyan ➤ Добавить новый чай             │
│ ${green}[2]$cyan ➤ Просмотреть коллекцию          │
│ ${green}[3]$cyan ➤ История и информация о чае     │
│ ${green}[4]$cyan ➤ Выход                          │
╰────────────────────────────────────────╯$reset
    """.trimIndent()
        )
    }
}