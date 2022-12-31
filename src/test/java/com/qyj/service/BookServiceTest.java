package com.qyj.service;

import com.qyj.config.SpringConfig;
import com.qyj.domain.Book;
import com.qyj.domain.Mechanism;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {

    @Autowired
    private BookService bookService;
    @Autowired
    private MechanismService mechanismService;

    @Test
    public void testGetById(){
        Book book = bookService.getById(1);
        System.out.println(book);
    }


    @Test
    public void testGetAll(){
        List<Book> books = bookService.getAll();
        System.out.println(books);
    }
    @Test
    public void testGetAll1(){
        List<Mechanism> books = mechanismService.getAll();
        System.out.println(books);
    }

    @Test
    public void testSave(){
        Book book = new Book();
        book.setType("ddd");
        book.setName("daf");
        book.setDescription("daf");
        boolean save = bookService.save(book);
        System.out.println(save);
    }
}
