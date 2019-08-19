package com.bookislife.booklab.ext

import com.bookislife.booklab.web.vo.BaseResponse

fun <T> List<T>.asResponse(): BaseResponse<List<T>> = BaseResponse(this)
