enum class Colors {
    GREEN, RED, BLUE, YELLOW, PURPLE;
    fun printString() {
        println(this.name)
    }

    fun printValue() {
        println(this.ordinal)
    }
}
enum class DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    fun printString() {
        println(this.name)
    }

    fun printValue() {
        println(this.ordinal)
    }
}
enum class Vehicles(var power : Double, var price: Double, var quantity : Int) {
    LIGHT(100.0,2000.0,15), HEAVY(150.0,10000.0,5), SERVICE(200.0,5000.0,3), MIDDLE(125.0,3500.0,10);
    fun  PriceofVehicles () : Double {
        var priceofvehicle = this.quantity * this.price
        return priceofvehicle
    }
    fun CanAfford (cash : Double, priceofvehicle : Double){
        if (cash >= priceofvehicle)
        {
            println("Вы можете себе позволить эти транспортные средства")
        }
    }
    fun TypesOfVehicles () : String {
        return when (this) {
            LIGHT -> "Бортовые грузовики, Компактные фургоны, Микроавтобусы "
            HEAVY -> "Грузовики, Самосвалы, Пикапы"
            SERVICE -> "Бульдозер, Мусоровоз, Трактор"
            MIDDLE -> "Пикапы, Лодки, Спортивные"
        }
    }
    fun GetInfo () {
        println("Сила транспорта - " + this.power)
        println("Цена транспорта - " + this.price + " рублей")
        println("Количество транспорта - " + this.quantity)
    }
}

enum class Flowers(var lenght : Double, var price: Double, var quantity : Int) {
    ROSE(5.0, 100.0, 15), TULIP(3.5, 65.0, 10), DAISIES(4.25, 40.0, 30);


    fun CanAfford(cash: Double, priceofflowers: Double) {
        if (cash >= priceofflowers) {
            println("Вы можете себе позволить эти цветы")
        }
        else
        {
            println("Вы не можете себе позволить эти цветы")
        }
    }

    fun Discount() : Double {
        println("Скидка на тюльпаны 10%, на ромашки 35%. Розы дороже на 15%")
        return when (this) {
            ROSE -> this.quantity * this.price* 1.15
            TULIP -> this.quantity * this.price * 0.9
            DAISIES -> this.quantity * this.price * 0.65
        }
    }
    fun GetInfo() {
        println("Длина стебля- " + this.lenght)
        println("Цена цветка - " + this.price + " рублей")
        println("Количество цветов - " + this.quantity)
    }
}