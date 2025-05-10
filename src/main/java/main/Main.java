package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxy.CommentNotificationProxy;
import proxy.EmailCommentNotificationProxy;
import repository.CommentRepository;
import repository.DBCommentRepository;
import service.CommentService;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("Laurent");
        comment.setText("Demo content");

        commentService.publishComment(comment);
    }
}