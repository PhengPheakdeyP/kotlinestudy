package pheakdey.developer.Camel_Case



class Camel(
    var name: String,
    var price: Double,
    var qty: Int
)


class Product(
    var productName: String,
    var productPrice: Double,
    var productQty: Int
)



const val COMPANY_NAME = "Pheakdey Store"
const val DISCOUNT_RATE = 0.05


fun calculateFinalPrice(price: Double, qty: Int): Double {
    val total = price * qty
    return total - (total * DISCOUNT_RATE)
}

fun functionDefault(){}
fun functionPara(name: String, price: Double, qty: Int) {
    println("Name: $name")
    println("Price: $price")
    println("Quantity: $qty")
}
fun functionPara(product: Camel) {
    println("Name: ${product.name}")
    println("Price: ${product.price}")
    println("Quantity: ${product.qty}")
}
fun getProductName(): String {
    return "Laptop"
}

fun calculateTotalPrice(price: Double, quantity: Int): Double {
    return price * quantity
}


fun main() {
    print("Enter product name: ")
    val name = readLine()!!

    print("Enter price: ")
    val price = readLine()!!.toDouble()

    print("Enter quantity: ")
    val qty = readLine()!!.toInt()


    val product = Camel(name, price, qty)
    functionPara(product)
    val total = calculateTotalPrice(product.price, product.qty)
    println("Total Price: $total")

    println(" Pascal case")
    val products = Product("Laptop", 1200.0, 3)
    println(products.productName)
    println(products.productPrice)
    println(products.productQty)

    println("")
    val productes = Product("Phone", 500.0, 2)
    println("Company: $COMPANY_NAME")
    println("Final Price: ${calculateFinalPrice(product.price, product.qty)}")



}