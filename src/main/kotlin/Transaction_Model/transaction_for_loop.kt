package pheakdey.developer.Transaction_Model

data class Transaction_Model (
    val transactionId: String,
    val transactionName: String,
    val transactionAmount: Double,
    val transactionDate: String,
)
val transactions = listOf(
    Transaction_Model("id01","Nata",1000.0,"20260208"),
    Transaction_Model("id02","Yiga",100.0,"20260207"),
    Transaction_Model("id03","Pisa",20.0,"20260209")
)
fun transactionById(
    transactionList: List<Transaction_Model>,
    searchId: String
): Transaction_Model? {
    for (transacition in transactionList) {
        if (transacition.transactionName == "Money") {
            continue
        }
        if (transacition.transactionId == searchId) {
            println("Found transaction: $transacition")
            return transacition
        }
    }
    println("Transaction not found")
    return null
}
fun main() {
    print("Enter your transaction Id: ")
    val searchId = readLine()!!
    transactionById(transactions, searchId)
}
