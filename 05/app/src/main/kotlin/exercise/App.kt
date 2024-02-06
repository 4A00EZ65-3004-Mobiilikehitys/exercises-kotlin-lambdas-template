package exercise

fun main(args: Array<String>) {
    val numberOfPersons: Int? = validate(args)

    if (numberOfPersons != null) {
        val listOfPersons: MutableList<Person> = createList(numberOfPersons)
        output(listOfPersons)
    } else {
        println("please give integer > 0")
    }
}
