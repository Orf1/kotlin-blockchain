class Blockchain {
    val blockchain: MutableList<Block> = ArrayList()

    init {
        blockchain.add(Block("Genesis Block", "", System.currentTimeMillis()))
    }
}