package com.bookislife.booklab.web

import com.bookislife.booklab.ext.asResponse
import com.bookislife.booklab.service.BookService
import com.bookislife.booklab.web.vo.BaseResponse
import com.bookislife.booklab.web.vo.BookReq
import com.bookislife.booklab.web.vo.BookRes
import org.springframework.web.bind.annotation.*
import javax.annotation.Resource
import javax.validation.Valid

@RequestMapping("/books")
@RestController
class BookResource {

    @Resource
    private lateinit var service: BookService

    /**
     * 获取所有图书
     */
    @GetMapping
    fun list(): BaseResponse<List<BookRes>> {
        return service.list().asResponse()
    }

    /**
     * 创建图书
     */
    @PostMapping
    fun create(@Valid @RequestBody req: BookReq): BaseResponse<Map<String, String>> {
        val dto = service.save(req)
        return BaseResponse.idResponse(dto.id!!)
    }

    /**
     * 更新图书
     */
    @PutMapping("/{id}")
    fun update(@PathVariable("id") id: Long, @Valid @RequestBody req: BookReq) {
        service.update(id, req)
    }
}