package org.blog_dudaryt.repo;

import org.blog_dudaryt.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
