package africa.semicolon.blogApplication.services;

import africa.semicolon.blogApplication.data.models.Post;
import africa.semicolon.blogApplication.dtos.requests.CreatePostRequest;
import africa.semicolon.blogApplication.dtos.responses.CreatePostResponse;

import java.util.List;
import java.util.Optional;

public interface PostService {
    CreatePostResponse createPost(CreatePostRequest createPostRequest);

    List<Post> findAllPosts();

    void delete(Post post);

    void deleteById(String id);

    Post findPostById(String id);

}
