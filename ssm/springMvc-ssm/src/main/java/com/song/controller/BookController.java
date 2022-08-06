package com.song.controller;


import com.song.domain.Book;
import com.song.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author song
 * @version 1.0
 * Create by 2022/8/4 20:54
 */

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public boolean save(@RequestBody Book book)
    {
        System.out.println("添加"+book.toString());
        return bookService.save(book);
    }

    @PutMapping
    public boolean update(@RequestBody Book book)
    {
        System.out.println("更改的内容为"+book.toString());
        return bookService.update(book);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        System.out.println("删除id为"+id+"内容");
        return bookService.delete(id);
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id)
    {
        System.out.println("查看全部数据");
        return bookService.getById(id);
    }

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }
}
