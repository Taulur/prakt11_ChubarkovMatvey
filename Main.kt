//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
val day = DayOfWeek.FRIDAY
val color = Colors.RED

    day.printString()
    day.printValue()
    color.printString()
    color.printValue()

    val vehicle = Vehicles.HEAVY
    vehicle.GetInfo()
    println("Цена всего транспорта " + vehicle.PriceofVehicles())
    var cash = 65000.0
    vehicle.CanAfford(cash,vehicle.PriceofVehicles())
    println("Пример : " + vehicle.TypesOfVehicles())

    val flower = Flowers.TULIP
    val priceofall = flower.Discount()
    cash = 500.0
    println("Цена за все цветы - " + priceofall + " рублей")
    flower.CanAfford(cash,priceofall)
    flower.GetInfo()
}