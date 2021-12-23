package africa.semicolon.blogApplication.dtos.requests;

import africa.semicolon.blogApplication.data.models.Author;
import lombok.Data;

@Data
public class CreatePostRequest {
    private String postId;
    private String postTitle;
    private String postContent;
    private String authorName;
}
