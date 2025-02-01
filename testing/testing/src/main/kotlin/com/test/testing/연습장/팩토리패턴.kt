open class Animal {
    open fun speak() {
        println("Animal speaks")
    }
}

class Cat : Animal() {
    override fun speak() {
        println("meow")
    }
}

class Dog : Animal() {
    override fun speak() {
        println("bark")
    }
}

fun factoryFn(animalType: String): Animal {
    return when (animalType) {
        "Cat" -> Cat()
        "Dog" -> Dog()
        else -> throw IllegalArgumentException("Unknown animal type")
    }
}

fun main() {
    val cat = factoryFn("Cat")
    val dog = factoryFn("Dog")

    cat.speak() // 출력: meow
    dog.speak() // 출력: bark
}

