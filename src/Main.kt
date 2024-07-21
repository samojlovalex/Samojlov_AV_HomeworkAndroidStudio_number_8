//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //TODO 1. Дан список целых чисел от 1 до 20 включительно. Посчитать количество
    // четных чисел списка, начиная с 5 элемента до конца списка. Целесообразно
    // использовать функции drop(), count().
    println("1. Задание\n")

    val listNumber = (1..20).toList()

    val listNumberCount = listNumber.drop(4).count{it % 2 == 0}

    println(listNumberCount)

    getLine("=")

    //TODO 2. Дан список целых чисел от 1 до 20 включительно. Посчитать сумму первых
    // 7 чисел списка, Целесообразно использовать функции take(), sum().
    println("2. Задание\n")

    val listNumberSum = listNumber.take(7).sum()

    println(listNumberSum)

    getLine("=")

    //TODO 3. Дан список строк: {"one", "two", "three"}. Необходимо получить и
    // вывести в консоль список вида:  [o, n, e, t, w, o, t, h, r, e, e].
    // Целесообразно использовать функции map(), flattaen().
    println("3. Задание\n")

    val strokeNumber = listOf("one", "two", "three")

    val strokeNumberChar = strokeNumber.map { it.map { it } }.flatten()

    println(strokeNumberChar)

    getLine("=")

    //TODO 4. Дан список строк. Найти строку максимальной длины. Целесообразно
    // использовать агрегатные операции.
    println("4. Задание\n")

    val colorRu = listOf(
        "красный",
        "оранжевый",
        "желтый",
        "зеленый",
        "голубой",
        "синий",
        "фиолетовый"
    )

    val colorLengthMax = colorRu.maxBy { it.length }

    println(colorLengthMax)

    getLine("=")

    //TODO 5. Написать класс Product с полями название и количество в конструкторе.
    // Создать список продуктов, состоящий из нескольких объектов класса.
    // Посчитать общее количество продуктов, имеющихся на складе (в списке).
    // Целесообразно использовать функции map(), fold().
    println("5. Задание\n")

    val product = listOf(
        Product("Яблоки", 20),
        Product("Котлеты", 10),
        Product("Капуста", 3),
        Product("Картофель", 50)
    )

    val productQuality = product.map { it.quantity }.fold(0){a, b, -> a + b}

    println(productQuality)

    getLine("^")
}