package com.example.NoticeBoard.domain.service

import com.example.common.enums.ErrorCode
import com.example.common.exception.DefaultException
import com.example.NoticeBoard.domain.dto.NoticeBoardResponse
import com.example.NoticeBoard.domain.model.repository.NoticeBoardRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class NoticeBoardService (
    private val noticeboardRepository: NoticeBoardRepository
){
    fun getNoticeBoard(id: Long): NoticeBoardResponse {
        return NoticeBoardResponse(noticeboard = (noticeboardRepository.findByIdOrNull(id)
            ?: throw DefaultException(errorCode = ErrorCode.NOTICEBOARD_NOT_FOUND)))
    }
}