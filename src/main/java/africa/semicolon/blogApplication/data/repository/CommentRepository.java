package africa.semicolon.blogApplication.data.repository;

import africa.semicolon.blogApplication.data.models.Comment;

import java.util.List;

public interface CommentRepository {
    Comment save(Comment comment);
    void delete(Comment comment);
    void delete(String id);
    Comment findById(String id);
    List<Comment> findAll();
}
