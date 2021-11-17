package africa.semicolon.blogApplication.data.repository;

import africa.semicolon.blogApplication.data.models.Post;
import africa.semicolon.blogApplication.data.repository.PostRepository;

import java.util.*;

public class PostRepositoryImpl implements PostRepository {
    Map<String, Post> datatbase = new HashMap<>();
    @Override
    public Post save(Post post) {
         datatbase.put(post.getId(), post);
         return post;
    }

    @Override
    public void delete(Post post) {
        delete(post.getId());
    }

    @Override
    public void delete(String id) {
       datatbase.remove(id);
    }

    @Override
    public Post findById(String id) {
        if(datatbase.containsKey(id)){
            return datatbase.get(id);
        }
        return null;
    }

    @Override
    public List<Post> findAll() {
        List<Post> all = new ArrayList<>();
        Set<String> keysInDB = datatbase.keySet();
        for(String key : keysInDB){
            all.add(datatbase.get(key));
        }
        return all;
    }
}
