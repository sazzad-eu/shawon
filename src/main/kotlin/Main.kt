fun main(args: Array<String>) {

    val dog = Dog()
    val cangaro = Cangaro()

    println("Animal name: ${dog.getNames()} moves like ${dog.move()}")
    println("Animal name: ${cangaro.getNames()} moves like ${cangaro.move()}")
}