var car  = 0
var bike = 0
var IDs = arrayListOf<Int>(0)
var id = 0

class ParkingManager() {

    var time_enter_car = Car(IDs).entryHour
    var time_exit_car = Car(IDs).exitHour

    var time_enter_bike = Bike(IDs).entryHour
    var time_exit_bike = Bike(IDs).exitHour

    fun add () {

        println("Bike = b or Car = c")
        val choise = readLine()

        id++
        IDs.remove(0)
        IDs.add(id)

        when (choise){

            "c" -> {
                car++
                println("Enter Time")
                time_enter_car = readLine()!!.toInt()
                if (time_enter_car > 24) {
                 id--
                    println("Wrong")
                }
                else
                println("your ID : $id")

            }

            "b" -> {
                bike++
                println("Enter Time")
                time_enter_bike = readLine()!!.toInt()
                if (time_enter_bike > 24) {
                    id--
                    println("Wrong")
                }
                else
                    println("your ID : $id")
            }

            else -> {
                println("Wrong")
            }
        }

      //  println("In Parking : Car => $car & Bike => $bike")    // لیست ماشین تو پارکینگ
       // println("IDS = $IDs")   //=> ایدی های ذخیره شده
       //  println(time_enter)        // تایم دریافتی
    }

    fun remove (){

        print(" Your ID = ")
        val i = readLine()!!.toInt()

        if (i<=id) {
            for (item in 0..i) {
                if (IDs[item] == id || item == 1) {

                    print("Exit Time = ")
                    time_exit_car = readLine()!!.toInt()
                    break
                }
            }
        }
        else
            println("Wrong")

    }
}