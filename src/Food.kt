open class Food {
    val name : String
    var price : double
    fun cook(): String

    fun discountedPrice(porcentaje: Int): double{
        return price-((porcentaje/100)*price)
    }
}
