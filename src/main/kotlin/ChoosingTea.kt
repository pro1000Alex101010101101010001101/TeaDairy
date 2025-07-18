interface ChoosingTea {

    val yellow get() = "\u001B[33m"
    val cyan get() = "\u001B[36m"
    val green get() = "\u001B[32m"
    val reset get() = "\u001B[0m"

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
}
