package repository;

import model.Comment;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class DBCommentRepository implements CommentRepository {

    private final Logger logger = Logger.getLogger(DBCommentRepository.class.getName());

    @Override
    public void storeComment(Comment comment) {
        logger.info("Storing comment: " + comment.getText());
    }
}
