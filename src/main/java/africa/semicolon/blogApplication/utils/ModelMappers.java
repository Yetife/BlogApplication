package africa.semicolon.blogApplication.utils;

import africa.semicolon.blogApplication.data.models.Post;
import africa.semicolon.blogApplication.dtos.requests.CreatePostRequest;
import africa.semicolon.blogApplication.dtos.responses.CreatePostResponse;

public class ModelMappers {
    public static Post map(CreatePostRequest createPostRequest) {
        Post post = new Post();
        post.setId(createPostRequest.getPostId());
        post.setTitle(createPostRequest.getPostTitle());
        post.setContent(createPostRequest.getPostContent());
        post.setAuthorName(createPostRequest.getAuthorName());

        return post;
    }

    public static CreatePostResponse map(Post post) {
        CreatePostResponse createPostResponse = new CreatePostResponse();
        createPostResponse.setId(post.getId());

        return createPostResponse;
    }
}
