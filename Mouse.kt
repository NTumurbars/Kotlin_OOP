class Mouse(name: String = "Jerry"): Animal(name)
{
    private var CheeseAmount: Int = 0

    fun getCheeseAmount()
    {
        println("$animalName has $CheeseAmount cheese")
    }

    override fun makeASound()
    {
        println("$animalName Squeaks")

    }

    fun StealCheese(amount: Int)
    {
        CheeseAmount += amount
        println("$animalName stole $amount cheese")
    }

    fun EatCheese()
    {
        if (CheeseAmount > 0)
        {
            CheeseAmount--
            println("$animalName ate 1 cheese")
        }
        else
        {
            println("Get some cheese, you don't have any to eat")
        }
    }
}
