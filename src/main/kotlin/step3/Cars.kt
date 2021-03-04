package step3

class Cars(val cars: List<Car>) : List<Car> by cars {
    companion object {
        fun fromNames(names: String): Cars {
            return Cars(names.split(",").map { Car(it) })
        }
    }
}
