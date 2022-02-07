class Blockchain(
    block: Block,
    val blockchain: MutableList<Block> =
        mutableListOf<Block>()
            .apply { add(block) }
)
