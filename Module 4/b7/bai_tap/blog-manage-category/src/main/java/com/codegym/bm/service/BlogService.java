package com.codegym.bm.service;

import com.codegym.bm.model.Blog;
import com.codegym.bm.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);

    Iterable<Blog> findAllByCategory(Category category);

    Page<Blog> findAllByNameContaining(String name, Pageable pageable);
}
