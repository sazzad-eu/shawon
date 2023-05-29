class Dog() : Animal("Dog"), Movement{

    override fun move(): String {
        return "Run run run"
    }

    fun move(fly:Boolean): String {
        return "Run run run"
    }
}