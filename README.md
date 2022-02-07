# kotlin-blockchain

Kotlin implementation of basic blockchain technology.

**Features:**
- Data and storage
- Mining and block validation
- Hashing and previous block identification.

**Todo:**

- Transaction system 
- Mining rewards
- Private/Public key system
- Alternate consensus methods
- Secure communication methods


```java
// Creates a new blockchain and initializes it with a "Genesis Block"
val bc = Blockchain(Block("Genesis Block", "", System.currentTimeMillis()))

// Creates a new block to add to the chain.
val block = Block("Hello Blockchain!", bc.blockchain[bc.blockchain.size -1].hash, System.currentTimeMillis())

// Mines block to verify it.
block.mine("00000")

// Adds verified block to the blockchain.
bc.blockchain.add(block)
```

Example Output:
```
Creating blockchain with genesis block.
Creating new block.
Block: Data: Hello Blockchain! Previous Hash: c93742f678e8beb33f4b6b80f3a50cabe77513f97081c9fe587d683f3a1cbfa7 Timestamp: 1644266765325
Unverified block hash: 1c85faeed128b7604b9e31257b13a4fbcce03715c200205d983b06bcda8d7705
Attempting to mine block.
Successfully mined block!
Calculating hash took 763541 attempts.
Verified block hash: 000000613e4f6ab796a9c3501a01a734e52634732c85ab59630472aaca992e33
Added verified block to blockchain.
```
