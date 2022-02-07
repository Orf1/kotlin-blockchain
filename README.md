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

/ Mines block to verify it.
block.mine("00000")

// Adds verified block to the blockchain.
bc.blockchain.add(block)
```

Example Output:
```
Creating blockchain with genesis block.
Unverified block hash: 3aa4e569311dbeb9532ef8b84fa440a052afb2995d2de0389152ca05b3c3d60f
Attempting to mine block.
Calculating hash took 2261122 attempts.
Successfully mined block!
Verified block hash: 00000c4c3f695c102b5766999d8f701d9f73bcec69846bffc4b078a2124fc64a
Added verified block to blockchain.
```
