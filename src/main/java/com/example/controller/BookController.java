package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/books")
public class BookController {

    @PostMapping(path = "/newBook")
    public String addBook() {

        return "new book";
    }

    @GetMapping(path = "/{id}")
    public String getBookById(@PathVariable(name = "id") int id) {

        return "book added";
    }

    @PutMapping(path = "/{id}")
    public String updateBookById(@PathVariable(name = "id") int id) {

        return "book updated";
    }

    @DeleteMapping(path = "/{id}")
    public String deleteBookById(@PathVariable(name = "id") int id) {

        return "book deleted";
    }
    
}
