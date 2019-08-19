package com.bookislife.booklab.persistence.mapper

import com.bookislife.booklab.persistence.entity.Book
import com.bookislife.booklab.service.dto.BookDto
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

@Mapper
interface BookMapper {

    /**
     * 选择性插入数据
     */
    fun insertSelective(book: BookDto)

    /**
     * 选择性更新数据
     */
    fun updateSelective(@Param("id") id: Long, @Param("cond") book: BookDto)

    /**
     * 查询所有数据
     */
    fun selectAll(): List<Book>
}