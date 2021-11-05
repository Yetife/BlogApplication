package africa.semicolon.blogApplication.services;

import africa.semicolon.blogApplication.data.models.Post;
import africa.semicolon.blogApplication.dtos.requests.CreatePostRequest;

import java.util.List;

public interface PostService {
    String createPost(CreatePostRequest createPostRequest);

    List<Post> findAllPosts();

    void delete(Post post);

    void deleteById(String id);

    Post findPostById(String id);

}
