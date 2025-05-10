package repository;

import model.Comment;
import org.springframework.stereotype.Component;

public interface CommentRepository {

    public void storeComment(Comment comment);
}
