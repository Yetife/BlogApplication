package africa.semicolon.blogApplication.data.repository;

import africa.semicolon.blogApplication.data.models.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentRepositoryImpl implements CommentRepository {
    List<Comment> comments = new ArrayList<>();
    @Override
    public Comment save(Comment comment) {
        comments.add(comment);
        return comment;
    }

    @Override
    public void delete(Comment comment) {
        comments.remove(comment);
    }

    @Override
    public void delete(String id) {
        Comment comment = findById(id);
        delete(comment);
    }

    @Override
    public Comment findById(String id) {
        for (Comment comment : comments) {
            if (comment.getCommentId().equals(id)){
                return comment;
            }
        }
        return null;
    }

    @Override
    public List<Comment> findAll() {
        return comments;
    }
}
