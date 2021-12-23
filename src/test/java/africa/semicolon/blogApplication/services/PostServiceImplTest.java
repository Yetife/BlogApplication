package africa.semicolon.blogApplication.services;

import africa.semicolon.blogApplication.data.models.Post;
import africa.semicolon.blogApplication.data.repository.PostRepository;
import africa.semicolon.blogApplication.data.repository.PostRepositoryImpl;
import africa.semicolon.blogApplication.dtos.requests.CreatePostRequest;
import africa.semicolon.blogApplication.dtos.responses.CreatePostResponse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostServiceImplTest {
    PostService postService;
    PostRepository postRepository;
    @BeforeEach
    void setUp() {
        postService = new PostServiceImpl();
        postRepository = new PostRepositoryImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createPost() {
       CreatePostResponse createPostResponse =  createPostTestHelper();
        assertEquals(1, postService.findAllPosts().size());
    }

    private CreatePostResponse createPostTestHelper() {
        CreatePostRequest createPostRequest = new CreatePostRequest();
        createPostRequest.setPostId("1234");
        createPostRequest.setAuthorName("Temilola");
        createPostRequest.setPostTitle("Fashion is the new trend");
        createPostRequest.setPostContent("Fashion is not just a style of dressing, it is a way of life every man should cultivate to depict our culture");
       return postService.createPost(createPostRequest);
    }

    @Test
    void findAllPosts() {
        createPostTestHelper();
        assertEquals(1, postService.findAllPosts().size());
    }

    @Test
    void delete() {

    }

    @Test
    void deleteById() {
    }

    @Test
    void findPostById() {
    }
}