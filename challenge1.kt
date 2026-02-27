//Challenge 1: The Advanced MoMo Agent (Control Flow)
fun calculateMoMoFee(amount: Int, balance: Int) {
    val fee = when {
        amount in 0 .. 5000 -> 500
        amount in 5001..60000 -> 1000
        else -> 2000
    }

    val total = amount + fee

    if (total <= balance) {
        println("Transaction Successful! Amount: $amount, Fee: $fee, Remaining Balance: ${balance - total}")
    } else {
        println("Insufficient Funds. Required: $total, Available: $balance")
    }
}