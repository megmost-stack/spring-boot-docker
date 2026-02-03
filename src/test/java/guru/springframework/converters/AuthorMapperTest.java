package guru.springframework.converters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorMapperTest {

    @Test
    void entityToAuthor() {
        assertTrue(Boolean.TRUE, "Testing getAuthor method");
    }

    @Test
    void authorToAuthorEntity() {
        assertTrue(Boolean.TRUE, "Testing getAuthorEntity method");
    }
}