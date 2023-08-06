package com.springboot2.springit.repositories;

import com.springboot2.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LinkRepository extends JpaRepository<Link,Long> {
}
