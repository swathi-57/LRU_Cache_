
// CacheEntity.java - Entity class for database storage
package com.example.cache;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CacheEntity {
    @Id
    private int key;
    private int value;

    public CacheEntity() {}

    public CacheEntity(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() { return key; }
    public int getValue() { return value; }
}
