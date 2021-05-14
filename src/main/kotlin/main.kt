import kotlin.random.Random

fun main(args: Array<String>) {

    for (iterador in Ejercicio1(11).array){
        println(iterador)
    }

    val array = Ejercicio2(10){ Random.nextInt(50, 250)}

    array.array.forEach { println(it) }
}