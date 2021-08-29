fun main() {

    println("Введите начальную стоимость покупки")
    val purchasesPrice = readLine()
    val purchasesPriceInt = purchasesPrice?.toInt()
    println("Постоянный покупатель или нет?(true или false)")
    val constCustomer = readLine()
    val constCustomerBool = constCustomer.toBoolean()
    var discount: Int = 0

    if (purchasesPriceInt != null) {
         if (purchasesPriceInt >= 1001 && purchasesPriceInt <= 10000) {
             discount = 100
         } else if (purchasesPriceInt >= 10001) {
             discount = purchasesPriceInt * 5 / 100
           }

        if (constCustomerBool == true) {
            discount = discount + purchasesPriceInt / 100
        }

        println("Стоимость покупки учитывая скидки " + (purchasesPriceInt - discount))
    }
}