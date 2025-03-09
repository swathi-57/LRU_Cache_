# 🚀 LRU Cache 

### 📌 Introduction :

This project is an implementation of an LRU (Least Recently Used) Cache in Java. The cache uses a combination of a HashMap and a Doubly Linked List to efficiently manage cache entries with O(1) time complexity for both get and put operations. Additionally, it includes features like cache expiry and statistics tracking.

### ✨ Features :

- ⚡ Efficient O(1) get and put operations using HashMap and Doubly Linked List.

- ⏳ Cache Expiry Mechanism to automatically remove stale entries.

- 🔒 Thread-Safe Implementation using synchronized methods.

- 📊 Statistics Tracking for cache hits and misses.

- 🔄 Automatic Cache Eviction when the capacity is exceeded.

- 🗑️ Clear Cache Functionality to manually reset the cache.

### 🛠 Technologies Used :

- ☕ Java

- 🗂 HashMap and Doubly Linked List

- ⚙️ Multi-threading (synchronized methods)

### 🏗 Installation & Setup

    1. Clone this repository:

```bash
git clone https://github.com/swathi-57/LRU_Cache_
```
    2. Navigate to the project directory:
```bash
cd lru-cache-java
```
    3. Compile and run the Java program:  
```bash
javac LRUCache.java
java LRUCache
```

### 📌 Usage Example
```bash
LRUCache cache = new LRUCache(2, 5000);
cache.put(1, 1);
cache.put(2, 2);
System.out.println(cache.get(1)); // returns 1
cache.put(3, 3); // evicts key 2
System.out.println(cache.get(2)); // returns -1 (not found)
cache.put(4, 4); // evicts key 1
System.out.println(cache.get(1)); // returns -1 (not found)
System.out.println(cache.get(3)); // returns 3
System.out.println(cache.get(4)); // returns 4
cache.printStatistics();
```
###  📚Methods

- 🔍 get(int key): Returns the value if present in the cache, otherwise -1.

- ✏️ put(int key, int value): Inserts or updates an item in the cache.

- 🧹 clearCache(): Clears the cache completely.

- 📈 printStatistics(): Prints cache hit and miss statistics.

### 🤝 Contributing

 If you want to contribute, feel free to fork this repository and submit a pull request.

### 📜 License

This project is licensed under the MIT License.
