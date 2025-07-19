interface ChoosingTeaInterface {

    private val yellow get() = "\u001B[33m"
    private val cyan get() = "\u001B[36m"
    private val green get() = "\u001B[32m"
    private val reset get() = "\u001B[0m"

    fun chooseTeaType() {
        val teaTypes = TeaType.entries

        println("\n")
        println("""
$cyan╭────────────────────────────────────────────╮
│       ${yellow}🌿 ВЫБЕРИТЕ ТИП ЧАЯ 🌿$cyan             │
├────────────────────────────────────────────┤
${buildTeaTypeList(teaTypes)}
╰────────────────────────────────────────────╯$reset
        """.trimIndent())
    }

    private fun buildTeaTypeList(teaTypes: List<TeaType>): String {
        return teaTypes.mapIndexed { index, teaType ->
            "$cyan│ ${green}[${index + 1}]$cyan ➤ ${teaType.title.padEnd(30)}│"
        }.joinToString("\n")
    }

    fun printInputBox(prompt: String = "Введите номер:"): Int {
        val boxWidth = prompt.length + 2

        val boxTop = "╭" + "─".repeat(boxWidth) + "╮"
        print(cyan + boxTop + "\n")
        print("│ $prompt $reset")  // 🡐 курсор останется здесь

        return boxWidth  // 🡐 возвращаем ширину для нижней рамки
    }

    fun boxBot(boxWidth: Int) {
        println("$cyan╰" + "─".repeat(boxWidth) + "╯$reset")
    }
}
