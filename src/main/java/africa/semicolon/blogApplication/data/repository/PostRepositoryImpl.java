package africa.semicolon.blogApplication.data.repository;

import africa.semicolon.blogApplication.data.models.Post;
import africa.semicolon.blogApplication.data.repository.PostRepository;

import java.util.ArrayList;
import java.util.List;

public class PostRepositoryImpl implements PostRepository {
    List<Post> posts = new ArrayList<>();
    @Override
    public Post save(Post post) {
         posts.add(post);
         return post;
    }

    @Override
    public void delete(Post post) {
        posts.remove(post);
    }

    @Override
    public void delete(String id) {
        Post post = findById(id);
        delete(post);
    }

    @Override
    public Post findById(String id) {
        for (Post post : posts)
        {
            if (post.getId().equals(id)){
                return post;
            }
        }
        return null;
    }

    @Override
    public List<Post> findAll() {
        return posts;
    }
}
