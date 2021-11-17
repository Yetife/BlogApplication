package africa.semicolon.blogApplication.dtos.responses;

import lombok.Data;

@Data
public class CreatePostResponse {
    private String id;
    private String blogAuthorName;
    private String blogTitle;
    private String content;
}
