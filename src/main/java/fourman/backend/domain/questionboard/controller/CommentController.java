package fourman.backend.domain.questionboard.controller;


import fourman.backend.domain.questionboard.controller.requestForm.CommentRequestForm;
import fourman.backend.domain.questionboard.controller.requestForm.QuestionBoardRequestForm;
import fourman.backend.domain.questionboard.entity.Comment;
import fourman.backend.domain.questionboard.entity.QuestionBoard;
import fourman.backend.domain.questionboard.service.CommentService;
import fourman.backend.domain.questionboard.service.response.CommentResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/question-board/comment")
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping("/register")
    public void commentRegister(@RequestBody CommentRequestForm commentRequestForm) {
        log.info("commentRequestForm");
        commentService.register(commentRequestForm);
    }

    @GetMapping("/{boardId}")
    public List<Comment> commentList (@PathVariable("boardId") Long boardId) {
        log.info("commentList");
        return commentService.commentList(boardId);
    }

    @DeleteMapping("/{commentId}")
        public void commentDelete(@PathVariable("commentId") Long commentId) {
            log.info("commentDelete()");
            commentService.commentDelete(commentId);
    }
    @PutMapping("/{commentId}")
    public Comment commentModify(@PathVariable("commentId") Long commentId,
                                 @RequestBody CommentRequestForm commentRequestForm) {
        return commentService.commentModify(commentId, commentRequestForm);
}
}