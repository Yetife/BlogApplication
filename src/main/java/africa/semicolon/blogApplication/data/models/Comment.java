package africa.semicolon.blogApplication.data.models;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Comment {
    private String commentId;
    private String commentorName;
    private String commentContent;
    private LocalDateTime commentDateAndTime;
}
