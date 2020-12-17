package chapter10Generics

class FishRetailer : Retailer<Fish> {

    override fun sell(): Fish {
        println("Sell fish")
        return Fish ("")
    }
}