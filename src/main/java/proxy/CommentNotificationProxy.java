package proxy;

import model.Comment;

public interface CommentNotificationProxy {

    public void sendComment(Comment comment);
}
