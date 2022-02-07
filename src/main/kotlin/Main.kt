fun main() {

    val bc = Blockchain()

    val block = Block("Hello Blockchain!", bc.blockchain[bc.blockchain.size -1].hash, System.currentTimeMillis())

    println("Unverified block hash: ${block.hash}")

    println("Attempting to mine block.")
    block.mine("00000")
    println("Successfully mined block!")
    println("Verified block hash: ${block.hash}")

    bc.blockchain.add(block)
    println("Added verified block to blockchain.")
}