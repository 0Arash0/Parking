abstract class Vehicle ( ID: ArrayList<Int>){

    var entryHour : Int = 0
        get() = field
        set(value) {

            field = value

        }

    var exitHour : Int = 0
        get() {

            return field
        }
        set(value) {

            field= value
        }

    abstract fun entrancePrice (price_Vehicle : Int )
    abstract fun hourPrice (price_Hour : Int  )

    fun getCost(ID: ArrayList<Int>) {

        println((exitHour-entryHour))

    }
}