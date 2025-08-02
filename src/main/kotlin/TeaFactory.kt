object TeaFactory {
    private val idGenerator = IdGenerator

    fun createTea(
        id: Int = idGenerator.generateId(),
        type: TeaType,
        name: String,
        year: Int,
        rating: Int?,
    ): Tea {
        return Tea(id, type, name, year, rating)
    }
}