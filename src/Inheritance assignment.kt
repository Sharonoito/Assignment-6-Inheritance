fun main() {
    var gari=Car("Toyota","Corolla","White",5)
    gari.carry(6)
    gari.identity()
 println(gari.calculateParkingFees(4))
var basi=Bus("Minibus","Nissan","White",51)
    println(basi.maxTripFare(200.00.toDouble()))
    println(basi.calculateParkingFees(6))
}
class Car( make:String, model:String, colour:String, capacity:Int) :Vehicle(make, model, colour, capacity){

    fun identity(){
        println("I am a white Toyota Corolla")
    }

}
class Bus( make:String,model:String,colour:String, capacity:Int):Vehicle(make, model, colour, capacity){
    fun maxTripFare(fare:Double):Double{
        return fare*capacity

    }

    override fun calculateParkingFees(hours: Int): Int {
        return capacity*hours
    }

}
open class Vehicle(var make:String,var model:String,var colour: String,var capacity:Int){
    fun carry(people: Int) {

        if (people <= capacity) {
            println("Carrying $people passengers");
        } else {
            println("Over capacity by $people");
        }
    }


    open fun calculateParkingFees(hours:Int):Int{
        return hours*20
    }

}

