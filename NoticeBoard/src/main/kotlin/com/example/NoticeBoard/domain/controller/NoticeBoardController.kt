package com.example.NoticeBoard.domain.controller

import com.example.common.dto.Response
import com.example.NoticeBoard.domain.dto.NoticeBoardResponse
import com.example.NoticeBoard.domain.service.NoticeBoardService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/daitssu/???")
class NoticeBoardController (
    private val noticeboardService: NoticeBoardService
){
    @GetMapping("/{id}")
    fun getNoticeBoard(
        @PathVariable id: Long
    ): Response<NoticeBoardResponse> =
        Response(data = noticeboardService.getNoticeBoard(id = id))
}