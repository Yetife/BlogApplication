package africa.semicolon.blogApplication.data.repository;

import africa.semicolon.blogApplication.data.models.Comment;
import africa.semicolon.blogApplication.data.models.Post;

import java.util.List;

public interface PostRepository {
    Post save(Post post);
    void delete(Post post);
    void delete(String id);
    Post findById(String id);
    List<Post> findAll();
}
