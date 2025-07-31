fun Food.discountedPrice(porcentaje: Int): Double{
    return price-((porcentaje/100)*price)
}

fun main() {

    //Instancias de comida
    val burger = Burger("Clásica", 45.0)
    val pizza = Pizza("Hawaiana", 50.0)
    val helado = IceCream("Chocolate", 15.0)
    val jugo = Juice("Manzana", 12.5)



    //Imprimir resultados de la función cook()
    val comidas = listOf<Food>(burger, pizza, helado, jugo)

    //En un ciclo para facilitar mostrarlos
    for (x in comidas) {
        println("${x.name} - Q${x.price}")
        println(x.cook())
    }

    //Para mostrar la función eat()
    println(helado.eat())

    //Solo para probar pour()
    println(jugo.pour())

    //Mostrar el precio con descuento
    println("Precio con descuento de la hamburguesa: Q${burger.discountedPrice(10)}")


}