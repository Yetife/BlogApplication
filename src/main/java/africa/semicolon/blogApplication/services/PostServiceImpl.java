package africa.semicolon.blogApplication.services;

import africa.semicolon.blogApplication.data.models.Post;
import africa.semicolon.blogApplication.data.repository.PostRepository;
import africa.semicolon.blogApplication.data.repository.PostRepositoryImpl;
import africa.semicolon.blogApplication.dtos.requests.CreatePostRequest;
import africa.semicolon.blogApplication.dtos.responses.CreatePostResponse;
import africa.semicolon.blogApplication.utils.ModelMappers;

import java.util.List;
import java.util.Optional;

public class PostServiceImpl implements PostService {
private static final PostRepository postRepository = new PostRepositoryImpl();
private final PostService postService = new PostServiceImpl();
    @Override
    public CreatePostResponse createPost(CreatePostRequest createPostRequest) {
        Post savedInDatabase = postRepository.findById(createPostRequest.getPostId());

        Post post = ModelMappers.map(createPostRequest);

        Post savedPost = postRepository.save(post);

        return ModelMappers.map(savedPost);
    }

    @Override
    public List<Post> findAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public void delete(Post post) {
        postRepository.delete(post);
    }

    @Override
    public void deleteById(String id) {
        postRepository.delete(id);
    }

    @Override
    public Post findPostById(String id) {
        return postRepository.findById(id);
    }
}
