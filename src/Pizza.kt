class Pizza(name: String, price: Double) : Food(name, price) {
    override fun cook(): String {
        return "Hornear la pizza a fuego medio por 15 minutos"
    }
}