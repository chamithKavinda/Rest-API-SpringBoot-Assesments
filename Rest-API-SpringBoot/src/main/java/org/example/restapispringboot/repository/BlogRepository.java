package org.example.restapispringboot.repository;

import org.example.restapispringboot.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,Integer> {
}
