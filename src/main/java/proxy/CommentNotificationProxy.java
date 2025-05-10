package proxy;

import model.Comment;
import org.springframework.stereotype.Component;

public interface CommentNotificationProxy {

    public void sendComment(Comment comment);
}
