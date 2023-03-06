package com.hrishikesh.Instagram.repository;

import com.hrishikesh.Instagram.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
