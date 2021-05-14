
import kotlin.random.Random

fun main(args: Array<String>) {
    //Ejercicio 1
   /* for (iterador in Ejercicio1(11).array){
        println(iterador)
    }*/
    //Ejercicio 2
    /*val array = Ejercicio2(10){ Random.nextInt(50, 250)}
    array.array.forEach { println(it) }*/

    //Ejercicio 3
    val array2 = Ejercicio3().listaFiltrada(Ejercicio2(10, {Random.nextInt(50, 250)}).array)
}