package africa.semicolon.blogApplication.data.models;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Data
public class Post {
    private String id;
    private String title;
    private String content;
    private String authorName;
    private LocalDateTime dateCreated;
    private List<Comment> comments = new ArrayList<>();


}
