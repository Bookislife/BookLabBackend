package com.bookislife.booklab.web.vo

import java.math.BigDecimal

data class BookRes(
        val id: String = "",
        val bookName: String = "",
        val author: String = "",
        val price: BigDecimal = BigDecimal.ZERO,
        val cover: String = "",
        val summary: String = ""
)