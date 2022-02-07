import java.security.MessageDigest

class Block(
    private val data: String,
    private val previousHash: String,
    private val timeStamp: Long
) {
    var hash = hash(this.toString())

    private var nonce = 0

    /**
     * The [String] form of this hashing block.
     */
    override fun toString() =
        "$data$previousHash$timeStamp$nonce"

    /**
     * Finds the SHA-256 hash of a String.
     *
     * @param input the input
     * @return the SHA-256 hashed output
     */
    private fun hash(input: String): String {
        val sha256 = MessageDigest
            .getInstance("SHA-256")

        val bytes = input.toByteArray()
        val digest = sha256.digest(bytes)

        return digest.fold("") { str, it ->
             "$str${"%02x".format(it)}"
        }
    }

    /**
     * Mines this block to specified prefix.
     */
    fun mine(prefix: String): String {
        while (!hash.startsWith(prefix)) {
            nonce += 1
            hash = hash(this.toString())

            if (hash.startsWith("0000")) {
                println(hash)
            }
        }

        return hash
    }
}
