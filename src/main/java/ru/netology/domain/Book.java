package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)

public class Book extends Product {
    private String bookAuthor;

    public Book(int id, String name, int price, String bookAuthor) {
        super(id, name, price);
        this.bookAuthor = bookAuthor;
    }
}
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        Book book = (Book) o;
//        return Objects.equals(bookAuthor, book.bookAuthor);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), bookAuthor);
//    }

