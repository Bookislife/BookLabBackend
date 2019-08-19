package com.bookislife.booklab.web.vo

data class BaseResponse<T>(val data: T, val code: Int = 0) {
    companion object {
        fun idResponse(id: Long): BaseResponse<Map<String, String>> {
            return BaseResponse(mapOf("id" to id.toString()))
        }
    }
}