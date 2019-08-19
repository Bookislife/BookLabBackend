package com.bookislife.booklab.service

import com.bookislife.booklab.persistence.mapper.BookMapper
import com.bookislife.booklab.service.dto.BookDto
import com.bookislife.booklab.web.vo.BookReq
import com.bookislife.booklab.web.vo.BookRes
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class BookService {

    private val mapper: BookMapper

    constructor(mapper: BookMapper) {
        this.mapper = mapper
    }

    @Transactional
    fun save(req: BookReq): BookDto {
        // 将请求体转换为DTO对象
        val bookDto = BookDto.fromReq(req)
        mapper.insertSelective(bookDto)
        return bookDto
    }

    @Transactional
    fun update(id: Long, req: BookReq) {
        // 将请求体转换为DTO对象
        val bookDto = BookDto.fromReq(req)
        mapper.updateSelective(id, bookDto)
    }

    fun list(): List<BookRes> {
        val books = mapper.selectAll()
        // 将数据库实体转换为响应体
        return books.map {
            BookRes(
                    id = it.id.toString(),
                    bookName = it.bookName,
                    price = it.price,
                    cover = it.cover,
                    summary = it.summary,
                    author = it.author
            )
        }
    }
}