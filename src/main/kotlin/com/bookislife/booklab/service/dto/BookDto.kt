package com.bookislife.booklab.service.dto

import com.bookislife.booklab.web.vo.BookReq
import java.math.BigDecimal

class BookDto(
        var id: Long? = null,
        var bookName: String? = null,
        var author: String? = null,
        var price: BigDecimal? = null,
        var cover: String? = null,
        var summary: String? = null
) {
    companion object {
        fun fromReq(req: BookReq): BookDto {
            return BookDto().apply {
                bookName = req.bookName
                author = req.author
                price = req.price
                cover = req.cover
                summary = req.summary
            }
        }
    }
}