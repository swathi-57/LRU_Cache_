
// CacheController.java - REST API with LRU Cache and Database Integration
package com.example.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cache")
public class CacheController {

    private final LRUCache lruCache;
    private final CacheRepository cacheRepository;

    @Autowired
    public CacheController(CacheRepository cacheRepository) {
        this.lruCache = new LRUCache(5);
        this.cacheRepository = cacheRepository;
    }

    @GetMapping("/{key}")
    public String getValue(@PathVariable int key) {
        int value = lruCache.get(key);
        if (value == -1) {
            Optional<CacheEntity> dbEntry = cacheRepository.findById(key);
            if (dbEntry.isPresent()) {
                value = dbEntry.get().getValue();
                lruCache.put(key, value);
            } else {
                return "Key not found";
            }
        }
        return "Value: " + value;
    }

    @PostMapping("/")
    public String putValue(@RequestParam int key, @RequestParam int value) {
        lruCache.put(key, value);
        cacheRepository.save(new CacheEntity(key, value));
        return "Stored Successfully";
    }
}
