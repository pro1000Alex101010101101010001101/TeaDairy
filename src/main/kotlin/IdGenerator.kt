object IdGenerator {
    private val teaRepository: TeaRepository = TeaRepository
    private const val ID_RANGE_START = 1000
    private const val ID_RANGE_END = 9999

    fun generateId(): Int {
        val existingIds = teaRepository.teas.map { it.id }.toSet()

        var newId: Int
        do {
            newId = (ID_RANGE_START..ID_RANGE_END).random()
        } while (newId in existingIds)

        return newId
    }
}
