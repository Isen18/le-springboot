package com.example.cache;

/**
 * @author Isen
 * @date 2018/12/25 14:30
 * @since 1.0
 */
public interface BookRepository {
    Book getByIsbn(String isbn);
}
