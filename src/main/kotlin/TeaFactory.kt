object TeaFactory {
    fun createTea(
        type: TeaType,
        name: String,
        year: Int,
        rating: Int,
    ): Tea {
        return Tea(type, name, year, rating)
    }
}