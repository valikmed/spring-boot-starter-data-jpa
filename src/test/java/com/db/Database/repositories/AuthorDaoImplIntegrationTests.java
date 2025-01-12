//package com.db.Database.repositories;
//
//import com.db.Database.TestDataUtil;
//import com.db.Database.domain.Author;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.DirtiesContext;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import java.util.List;
//import java.util.Optional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest
//@ExtendWith(SpringExtension.class)
////Clean context after each test methods because I use many times the same implementation in tests
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
//public class AuthorDaoImplIntegrationTests {
//
//    private AuthorDaoImpl underTest;
//
//    @Autowired // This is way to say for Spring that should inject dependency as declared in constructor
//    public AuthorDaoImplIntegrationTests(AuthorDaoImpl underTest) {
//        this.underTest = underTest;
//    }
//
//    @Test
//    public void testThatAuthorCanBeCalledAndRecalled() {
//        Author author = TestDataUtil.createTestAuthorA();
//        underTest.create(author);
//        Optional<Author> result = underTest.findOne(author.getId());
//        assertThat(result).isPresent();
//        assertThat(result.get()).isEqualTo(author);
//    }
//
//    @Test
//    public void testThatMultipleAuthorsCanCreatedAndRecalled() {
//        Author authorA = TestDataUtil.createTestAuthorA();
//        underTest.create(authorA);
//        Author authorB = TestDataUtil.createTestAuthorB();
//        underTest.create(authorB);
//        Author authorC = TestDataUtil.createTestAuthorC();
//        underTest.create(authorC);
//
//        List<Author> result = underTest.find();
//        assertThat(result)
//                .hasSize(3)
//                .containsExactly(authorA, authorB, authorC);
//    }
//
//    @Test
//    public void testThatAuthorCanBeUpdated(){
//        Author authorA = TestDataUtil.createTestAuthorA();
//        underTest.create(authorA);
//        authorA.setName("UPDATED");
//        underTest.update(authorA, authorA.getId());
//
//        Optional<Author> result = underTest.findOne(authorA.getId());
//        assertThat(result).isPresent();
//        assertThat(result.get()).isEqualTo(authorA);
//
//    }
//
//    @Test
//    public void testThatAuthorCanBeDeleted(){
//        Author authorA =  TestDataUtil.createTestAuthorA();
//        underTest.create(authorA);
//        underTest.delete(authorA.getId());
//        Optional<Author> result = underTest.findOne(authorA.getId());
//        assertThat(result).isEmpty();
//    }
//}
