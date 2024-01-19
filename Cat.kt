class Cat(_name:String="The Cat"):Animal(_name)
{
    override fun makeASound()
    {
        meow()

    }

    private fun meow()
    {
        println("$animalName said meow")
    }
}