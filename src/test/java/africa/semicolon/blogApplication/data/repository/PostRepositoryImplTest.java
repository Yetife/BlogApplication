package africa.semicolon.blogApplication.data.repository;

import africa.semicolon.blogApplication.data.models.Post;
import africa.semicolon.blogApplication.dtos.PostRepositoryImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PostRepositoryImplTest {
    private PostRepository postRepository;
    @BeforeEach
    void setUp() {
        postRepository = new PostRepositoryImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void save() {
        Post post = new Post();
        post.setId("1234");
        post.setTitle("Fitness Pal");
        post.setContent("My Fitness Pal is an online platform that helps people lose weight.");
        LocalDateTime datePostWasCreated = LocalDateTime.now();
        post.setDateCreated(datePostWasCreated);

        Post savedPost = postRepository.save(post);
        assertEquals(post, savedPost);

    }

    @Test
    void delete() {
        Post post = new Post();
        post.setId("1234");
        post.setTitle("Fitness Pal");
        post.setContent("My Fitness Pal is an online platform that helps people lose weight.");
        LocalDateTime datePostWasCreated = LocalDateTime.now();
        post.setDateCreated(datePostWasCreated);

        Post savedPost = postRepository.save(post);
        postRepository.delete(post);
        assertNull(postRepository.findById("1234"));
    }

    @Test
    void testDelete() {
        Post post = new Post();
        post.setId("1234");
        post.setTitle("Fitness Pal");
        post.setContent("My Fitness Pal is an online platform that helps people lose weight.");
        LocalDateTime datePostWasCreated = LocalDateTime.now();
        post.setDateCreated(datePostWasCreated);

        Post savedPost = postRepository.save(post);
        postRepository.delete("1234");
        assertNull(postRepository.findById("1234"));
    }

    @Test
    void findById() {
        Post post = new Post();
        post.setId("1234");
        post.setTitle("Fitness Pal");
        post.setContent("My Fitness Pal is an online platform that helps people lose weight.");
        LocalDateTime datePostWasCreated = LocalDateTime.now();
        post.setDateCreated(datePostWasCreated);

        Post savedPost = postRepository.save(post);
        Post foundPost = postRepository.findById("1234");
        assertEquals(post,foundPost);
    }

    @Test
    void findAll() {
        Post post = new Post();
        post.setId("1234");
        post.setTitle("Fitness Pal");
        post.setContent("My Fitness Pal is an online platform that helps people lose weight.");
        LocalDateTime datePostWasCreated = LocalDateTime.now();
        post.setDateCreated(datePostWasCreated);
        postRepository.save(post);
        postRepository.save(post);
        postRepository.save(post);
        assertEquals(3, postRepository.findAll().size());
    }
}