package com.example.NoticeBoard.domain.model.repository

import com.example.NoticeBoard.domain.model.entity.NoticeBoard
import org.springframework.data.jpa.repository.JpaRepository

class NoticeBoardRepository: JpaRepository<NoticeBoard, Long>{
}