package com.codeup.springblog.dao;

import com.codeup.springblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRespository extends JpaRepository<Post, Long> {
    Post findPostsById(long id);

    Post findPostsByTitle(String title);
}
