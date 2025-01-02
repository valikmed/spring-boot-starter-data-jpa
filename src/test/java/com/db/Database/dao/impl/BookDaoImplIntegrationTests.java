package com.db.Database.dao.impl;

import com.db.Database.TestDataUtil;
import com.db.Database.domain.Author;
import com.db.Database.domain.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class BookDaoImplIntegrationTests {

    private BookDaoImpl bookDao;
    private AuthorDaoImpl authorDao;

    @Autowired
    public BookDaoImplIntegrationTests(BookDaoImpl bookDao, AuthorDaoImpl authorDao) {
        this.bookDao = bookDao;
        this.authorDao = authorDao;
    }

    @Test
    public void testThatBookCanBeCalledAndRecalled() {
        Author author = TestDataUtil.createTestAuthorA();
        authorDao.create(author);
        Book book = TestDataUtil.createTestBookA();
        bookDao.create(book);
        book.setAuthorId(author.getId());
        Optional<Book> result = bookDao.findOne(book.getIsbn());
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(book);
    }

    @Test
    public void testThatMultipleBookCanBeCreatedAndRecalled() {
        Author author = TestDataUtil.createTestAuthorA();
        authorDao.create(author);

        Book bookA = TestDataUtil.createTestBookA();
        bookA.setAuthorId(author.getId());
        bookDao.create(bookA);

        Book bookB = TestDataUtil.createTestBookB();
        bookB.setAuthorId(author.getId());
        bookDao.create(bookB);

        Book bookC = TestDataUtil.createTestBookC();
        bookC.setAuthorId(author.getId());
        bookDao.create(bookC);

        List<Book> result = bookDao.find();
        assertThat(result)
                .hasSize(3)
                .containsExactly(bookA, bookB, bookC);

    }
}
