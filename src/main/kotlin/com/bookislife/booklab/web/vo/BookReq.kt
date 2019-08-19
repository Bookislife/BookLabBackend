package com.bookislife.booklab.web.vo

import java.math.BigDecimal
import javax.validation.constraints.NotEmpty

data class BookReq(
        @NotEmpty
        val bookName: String = "",
        @NotEmpty
        val author: String = "",
        val price: BigDecimal = BigDecimal.ZERO,
        val cover: String = "",
        val summary: String = ""
)