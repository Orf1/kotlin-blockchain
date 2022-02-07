fun main() {
    println("Creating blockchain with genesis block.")

    // Creates a new blockchain with a genesis block.
    val bc = Blockchain(Block("Genesis Block", "", System.currentTimeMillis()))

    // Creates first additional block to mine.
    val block = Block("Hello Blockchain!", bc.blockchain[bc.blockchain.size -1].hash, System.currentTimeMillis())

    println("Unverified block hash: ${block.hash}")
    println("Attempting to mine block.")

    // Brute forces until valid hash is found.
    block.mine("00000")

    println("Successfully mined block!")
    println("Calculating hash took ${block.nonce} attempts.")
    println("Verified block hash: ${block.hash}")

    // Adds verified block to blockchain.
    bc.blockchain.add(block)

    println("Added verified block to blockchain.")
}