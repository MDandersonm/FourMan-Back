package fourman.backend.domain.noticeBoard.service;

import fourman.backend.domain.noticeBoard.controller.requestForm.NoticeBoardRequestForm;
import fourman.backend.domain.noticeBoard.entity.NoticeBoard;

import java.util.List;

public interface NoticeBoardService {
    NoticeBoard register(NoticeBoardRequestForm noticeBoardRequestForm);

    List<NoticeBoard> list();

    NoticeBoard read(Long boardId);

    NoticeBoard modify(Long boardId, NoticeBoardRequestForm noticeBoardRequestForm);

    void delete(Long boardId);
}