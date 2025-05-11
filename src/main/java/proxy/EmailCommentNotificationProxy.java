package proxy;

import model.Comment;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    private final Logger logger = Logger.getLogger(EmailCommentNotificationProxy.class.getName());

    @Override
    public void sendComment(Comment comment) {
        logger.info("Sending notification for comment: " + comment.getText());
    }
}
