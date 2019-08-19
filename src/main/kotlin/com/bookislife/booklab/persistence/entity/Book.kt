package com.bookislife.booklab.persistence.entity

import java.math.BigDecimal

/**
 * 表book的实体
 */
data class Book(
        val id: Long? = null,
        val bookName: String,
        val author:String = "",
        val price: BigDecimal = BigDecimal.ZERO,
        val cover: String = "",
        val summary: String = ""
)