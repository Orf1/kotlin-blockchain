class Blockchain(block: Block) {
    val blockchain: MutableList<Block> = ArrayList()

    // Adds the initial/genesis block to the blockchain.
    init {
        blockchain.add(block)
    }
}