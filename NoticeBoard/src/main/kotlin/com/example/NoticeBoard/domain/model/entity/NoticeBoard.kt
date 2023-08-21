package com.example.NoticeBoard.domain.model.entity

import com.example.common.domain.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(schema = "noticeboard")
class NoticeBoard (
    val title: String,
    val department_id: Long,
    val content: String,
    val category: String,
    val image_url: List<String>? = null,
    val file_url: List<String>? = null,
): BaseEntity()