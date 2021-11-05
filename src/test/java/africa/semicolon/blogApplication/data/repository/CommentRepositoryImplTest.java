package africa.semicolon.blogApplication.data.repository;

import africa.semicolon.blogApplication.data.models.Comment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CommentRepositoryImplTest {
    CommentRepository commentRepository;
    @BeforeEach
    void setUp() {
        commentRepository = new CommentRepositoryImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void save() {
        Comment comment = new Comment();
        comment.setCommentId("21");
        comment.setCommentorName("Yetunde");
        comment.setCommentContent("Fitness is a lifestyle");
        LocalDateTime dateCommentWasPosted = LocalDateTime.now();
        comment.setCommentDateAndTime(dateCommentWasPosted);

        Comment savedComment = commentRepository.save(comment);
        assertEquals(comment, savedComment);
    }

    @Test
    void delete() {
        Comment comment = new Comment();
        comment.setCommentId("21");
        comment.setCommentorName("Yetunde");
        comment.setCommentContent("Fitness is a lifestyle");
        LocalDateTime dateCommentWasPosted = LocalDateTime.now();
        comment.setCommentDateAndTime(dateCommentWasPosted);

        Comment savedComment = commentRepository.save(comment);
        commentRepository.delete(comment);
        assertNull(commentRepository.findById("21"));
    }

    @Test
    void testDelete() {
        Comment comment = new Comment();
        comment.setCommentId("21");
        comment.setCommentorName("Yetunde");
        comment.setCommentContent("Fitness is a lifestyle");
        LocalDateTime dateCommentWasPosted = LocalDateTime.now();
        comment.setCommentDateAndTime(dateCommentWasPosted);

        commentRepository.save(comment);
        commentRepository.delete("21");
        assertNull(commentRepository.findById("21"));
    }

    @Test
    void findById() {
        Comment comment = new Comment();
        comment.setCommentId("21");
        comment.setCommentorName("Yetunde");
        comment.setCommentContent("Fitness is a lifestyle");
        LocalDateTime dateCommentWasPosted = LocalDateTime.now();
        comment.setCommentDateAndTime(dateCommentWasPosted);

        Comment foundComment = commentRepository.findById("21");
        assertEquals(comment, foundComment);
        }

    @Test
    void findAll() {
        Comment comment = new Comment();
        comment.setCommentId("21");
        comment.setCommentorName("Yetunde");
        comment.setCommentContent("Fitness is a lifestyle");
        LocalDateTime dateCommentWasPosted = LocalDateTime.now();
        comment.setCommentDateAndTime(dateCommentWasPosted);
        commentRepository.save(comment);
        commentRepository.save(comment);
        commentRepository.save(comment);
        commentRepository.save(comment);

        assertEquals(4, commentRepository.findAll().size());

    }
}