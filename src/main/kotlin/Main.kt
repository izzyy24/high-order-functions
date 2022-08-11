fun main() {
    val vehicles = mutableListOf<Car>(
        Car("Toyota", "Camry", 2003, 10000, "White"),
        Car("Maserati", "Ghibli", 2022, 20000, "Black"),
        Car("BMW", "X4", 2021, 10000, "Red"),
        Car("BMW", "X3", 2021, 10000, "White"),
        Car("Subaru", "WRX", 2023, 15000, "Blue"),
        Car("Ford", "Edge", 2010, 25000, "Grey"),
        Car("Audi", "A5", 2010, 20000, "Silver"),
        Car("Ford", "Fiesta", 2012, 12000, "Black"),
        Car("Hyundai", "i30", 2012, 30000, "Silver"),
        Car("Mazda", "CX-5", 2011, 35000, "Red"),
    )

    var blueCars = vehicles.filter { c ->  c.colour == "Blue"}
    println(blueCars)

    var toyotas = vehicles.filter { c -> c.make == "Toyota" }
    println(toyotas)

    var beetles = vehicles.filter { c -> c.model == "Beetles" && c.make == "Volkswagen" }
    println(beetles)

    var blueCarsName = blueCars.map { c -> "${c.make} ${c.model} ${c.colour}" }
    println(blueCarsName)
    
    var newCars = vehicles
        .filter { c -> c.year >= 2018}
        .map { c -> "${c.make} ${c.model} ${c.year} ${c.kmDriven}km ${c.colour}" }
        .forEach{ c -> println(c) }


    var totalDistanceDrivenByBmws = vehicles
        .filter { c -> c.make == "BMW" }
        .fold(0) { total, distance -> total + distance.kmDriven }
    println(totalDistanceDrivenByBmws)

}

data class Car(
    val make: String,
    val model:String,
    val year: Int,
    val kmDriven:Int,
    val colour:String,
)
