package africa.semicolon.blogApplication.dtos.requests;

import lombok.Data;

@Data
public class CreatePostRequest {
    private String postId;
    private String postTitle;
    private String blogContent;
    private String authorName;
}
