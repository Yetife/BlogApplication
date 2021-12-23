package africa.semicolon.blogApplication.controllers;

import africa.semicolon.blogApplication.data.models.Post;
import africa.semicolon.blogApplication.dtos.requests.CreatePostRequest;
import africa.semicolon.blogApplication.dtos.responses.CreatePostResponse;
import africa.semicolon.blogApplication.services.PostService;
import africa.semicolon.blogApplication.services.PostServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {
    private PostService postService= new PostServiceImpl();

    @PostMapping("/api/post")
    public CreatePostResponse createPost(@RequestBody CreatePostRequest createPostRequest) {
        return postService.createPost(createPostRequest);
    }

    @GetMapping("/api/v1/post/{id}")
    public Post getPostById(@PathVariable("id") String id) {
        return postService.findPostById(id);
    }
}
