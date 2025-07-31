class Juice(name: String, price: Double) : Drink(name, price) {
    override fun cook(): String {
        return "Exprimir y licuar las frutas"
    }

    override fun pour(): String {
        return "Servir en un vaso con un recipiente adecuado"
    }
}