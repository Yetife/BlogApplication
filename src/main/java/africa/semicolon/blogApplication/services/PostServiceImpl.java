package africa.semicolon.blogApplication.services;

import africa.semicolon.blogApplication.data.models.Post;
import africa.semicolon.blogApplication.dtos.requests.CreatePostRequest;

import java.util.List;

public class PostServiceImpl implements PostService {

    @Override
    public String createPost(CreatePostRequest createPostRequest) {
        return null;
    }

    @Override
    public List<Post> findAllPosts() {
        return null;
    }

    @Override
    public void delete(Post post) {

    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public Post findPostById(String id) {
        return null;
    }
}
