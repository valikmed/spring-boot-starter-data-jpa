package com.db.Database;

import com.db.Database.domain.Author;

public final class TestDataUtil {

    public TestDataUtil() {
    }

    public static Author createTestAuthor() {
        return Author.builder()
                .id(1L)
                .name("Abigail Rose")
                .age(80)
                .build();
    }
}
