package pheakdey.developer.Transaction_Model

data class Transaction_Model_Frist(
    val transactionId: String,
    val senderName: String,
    val senderAccountNo: String,
    val receiverAccountName: String,
    val receiverAccountNo: String,
    val transactionDate: String, // yyyymmdd
    val transactionAmount: Double,
    val transactionCurrency: String,
    val transactionType: String,
    val debitAccount: Double,
    val creditAccount: Double
)

val transactionList = listOf<Transaction_Model_Frist>(
    Transaction_Model_Frist(
        transactionId = "TXN001",
        senderName = "Pheakdey",
        senderAccountNo = "AC001",
        receiverAccountName = "Sokha",
        receiverAccountNo = "AC002",
        transactionDate = "20260208",
        transactionAmount = 150.0,
        transactionCurrency = "USD",
        transactionType = "TRANSFER",
        debitAccount = 150.0,
        creditAccount = 150.0
    ),
    Transaction_Model_Frist(
            transactionId = "TXN002",
            senderName = "Pheakdey",
            senderAccountNo = "AC001",
            receiverAccountName = "BANK",
            receiverAccountNo = "AC000",
            transactionDate = "20260209",
            transactionAmount = 200.0,
            transactionCurrency = "USD",
            transactionType = "DEPOSIT",
            debitAccount = 0.0,
            creditAccount = 200.0
        ),
    Transaction_Model_Frist(
        transactionId = "TXN003",
        senderName = "Pheakdey",
        senderAccountNo = "AC001",
        receiverAccountName = "SHOP",
        receiverAccountNo = "AC999",
        transactionDate = "20260210",
        transactionAmount = 50.0,
        transactionCurrency = "USD",
        transactionType = "WITHDRAW",
        debitAccount = 50.0,
        creditAccount = 0.0
    )
)

fun filterTransactionByDate (list: List<Transaction_Model_Frist>,transactionDate: String): List<Transaction_Model_Frist> {
val newList = list.filter { transaction -> transaction.transactionDate == transactionDate }
    return newList
}
fun searchTransactionById(list: List<Transaction_Model_Frist>,trasactionId: String): Transaction_Model_Frist? {
for (transaction in list) {
    if (transaction.transactionId == trasactionId) {
        return transaction
    }
}
    return null
}
fun main() {
//    for (tx in transactionList) {
//        println(tx)
//    }
//    print("Plase enter transaction date: ")
//    val transactionDate = readln()
//    val transactionFilterResult =filterTransactionByDate(transactionList,transactionDate)
//    print(transactionFilterResult)
//    println("")

    print("Enter your transaction Id: ")
    val transactionId: String = readln()
    val transaction = searchTransactionById(list = transactionList, trasactionId = transactionId)
    println(transaction)
}
