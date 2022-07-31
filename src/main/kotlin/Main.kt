fun main(args: Array<String>) {

 while (true) {

    println("Please type : 1 = Add vehicle , 2 = Remove  vehicle , Q = Quit")
    var Menu = readLine()
    val manage = ParkingManager()

    when (Menu) {

        "1" -> manage.add()
        "2" -> manage.remove()
        "Q" -> break
        else -> println("Wrong")
    }
    continue
  }

}