package africa.semicolon.blogApplication.services;

import africa.semicolon.blogApplication.data.models.Post;
import africa.semicolon.blogApplication.data.repository.PostRepository;
import africa.semicolon.blogApplication.data.repository.PostRepositoryImpl;
import africa.semicolon.blogApplication.dtos.requests.CreatePostRequest;
import africa.semicolon.blogApplication.dtos.responses.CreatePostResponse;

import java.util.List;

public class PostServiceImpl implements PostService {
private static final PostRepository postRepository = new PostRepositoryImpl();
    @Override
    public CreatePostResponse createPost(CreatePostRequest createPostRequest) {
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
