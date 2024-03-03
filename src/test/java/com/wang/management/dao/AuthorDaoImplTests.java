package com.wang.management.dao;


import com.wang.management.dao.impl.AuthorDaoImpl;
import com.wang.management.domain.Author;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

@ExtendWith(MockitoExtension.class)
public class AuthorDaoImplTests {


    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private AuthorDaoImpl underTest;

    @Test
    public void testThatCreateAuthorGeneratesCorrect() {
        Author author = Author.builder()
                        .id(1L)
                        .name("Nguyen")
                        .age(80)
                                .build();
        underTest.create(author);
    }
}
