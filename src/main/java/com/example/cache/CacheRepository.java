
// CacheRepository.java - Spring Data JPA repository for cache
package com.example.cache;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CacheRepository extends JpaRepository<CacheEntity, Integer> {}
