package com.codegym.bm.repository;

import com.codegym.bm.model.Blog;
import com.codegym.bm.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BlogRepository extends PagingAndSortingRepository<Blog, Long> {
    Iterable<Blog> findAllByCategory(Category category);
    Page<Blog> findAllByNameContaining(String name, Pageable pageable);
}
