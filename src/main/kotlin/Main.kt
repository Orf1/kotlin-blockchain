fun main() {
    val block = Block("Hello Blockchain!", "null", System.currentTimeMillis())

    println("Un-mined block hash: ${block.hash}")

    println("Attempting to mine block.")
    block.mine("00000")
    println("Successfully mined block!")

    println("Mined block hash: ${block.hash}")
}