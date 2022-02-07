import java.security.MessageDigest

class Block (val data: String, val previousHash: String, val timeStamp: Long) {
    var hash: String = hash(this.toString())
    var nonce = 0

    // Builds String used when hashing block.
    override fun toString(): String {
        return data + previousHash + timeStamp.toString() + nonce
    }

    // Finds the SHA-256 hash of a String.
    private fun hash(toHash: String): String {
        val bytes = toHash.toByteArray()
        val md = MessageDigest.getInstance("SHA-256")
        val digest = md.digest(bytes)
        return digest.fold("") { str, it -> str + "%02x".format(it) }
    }

    // Mines block to specified prefix.
    fun mine(prefix: String): String {
        while (!hash.startsWith(prefix)) {
            nonce++
            hash = hash(this.toString())
//            if(hash.startsWith("0000")) {
//                println(hash)
//            }
        }
        return hash
    }
}