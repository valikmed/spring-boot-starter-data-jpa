package com.db.Database;

import com.db.Database.domain.Author;
import com.db.Database.domain.Book;

public final class TestDataUtil {

    public TestDataUtil() {
    }

    public static Author createTestAuthorA() {
        return Author.builder()
                .id(1L)
                .name("Abigail Rose")
                .age(40)
                .build();
    }
    public static Author createTestAuthorB() {
        return Author.builder()
                .id(2L)
                .name("Santiago Barnabe")
                .age(30)
                .build();
    }
    public static Author createTestAuthorC() {
        return Author.builder()
                .id(3L)
                .name("Christofer Dil")
                .age(60)
                .build();
    }

    public static Book createTestBookA() {
        return Book.builder()
                .isbn("978-1-2345-6789-0")
                .title("The Shadow in the Attic")
                .authorId(1L)
                .build();
    }

    public static Book createTestBookB() {
        return Book.builder()
                .isbn("978-1-2345-6789-1")
                .title("The Shadow in the Attic")
                .authorId(1L)
                .build();
    }

    public static Book createTestBookC() {
        return Book.builder()
                .isbn("978-1-2345-6789-2")
                .title("The Shadow in the Attic")
                .authorId(1L)
                .build();
    }

}
