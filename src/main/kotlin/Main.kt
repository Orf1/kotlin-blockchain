fun main() {

    val chain = Blockchain()

    val block = Block("Hello Blockchain!", chain.blockchain[chain.blockchain.size -1].hash, System.currentTimeMillis())

    println("Un-mined block hash: ${block.hash}")

    println("Attempting to mine block.")
    block.mine("00000")
    println("Successfully mined block!")
    println("Mined block hash: ${block.hash}")

    chain.blockchain.add(block)
    println("Added verified block to blockchain.")
}