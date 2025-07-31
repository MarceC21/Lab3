class IceCream(name: String, price: Double) : Food(name, price), Dessert {
    override fun cook(): String {
        return "Enfriarlo a 15°C"
    }

    override fun eat(): String {
        return "Comer lo antes posible para que no se derrita"
    }
}
