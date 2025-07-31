class Burger(name: String, price: Double) : Food(name, price) {
    override fun cook(): String {
        return "la hamburguesa se debe asar a fuego medio con espatula"
    }
}