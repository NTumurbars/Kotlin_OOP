//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
    val dog0:Animal = Dog("hachiko")
    val cat0:Animal = Cat("Tom")
    val mouse0:Mouse = Mouse()

    mouse0.StealCheese(5)
    mouse0.EatCheese()
    mouse0.getCheeseAmount()

    moveAndMakeASound(dog0)
    moveAndMakeASound(cat0)

}

fun moveAndMakeASound(animal:Animal)
{
    animal.move("forward")
    animal.makeASound()
}
