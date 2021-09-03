package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductManagerTest {
    ProductRepository repository = new ProductRepository();
    ProductManager productManager = new ProductManager(repository);

    private Book book1 = new Book(1, "Лолита", 100, "Владимир Набоков");
    private Book book2 = new Book(2, "Подсознание может все", 200, "Джон Кехо");
    private Book book6 = new Book(6, "Подсознание и ты", 250, "Джон Кехо");
    private Smartphone smartphone3 = new Smartphone(3, "IPhone11", 55000, "Apple");
    private Smartphone smartphone4 = new Smartphone(4, "Samsung Galaxy S21", 13000, "Samsung");
    private Smartphone smartphone5 = new Smartphone(5, "Xiaomi Redmi 9T", 14000, "Xiaomi");

    @BeforeEach
    void setUp() {
        productManager.add(book1);
        productManager.add(book2);
        productManager.add(smartphone3);
        productManager.add(smartphone4);
        productManager.add(smartphone5);
        productManager.add(book6);
    }

    @Test
    public void shouldSearchBookByName() {
        Product[] expected = new Product[]{book1};
        Product[] actual = productManager.searchBy("Лолита");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchBookByAuthor() {
        Product[] expected = new Product[]{book1};
        Product[] actual = productManager.searchBy("Владимир Набоков");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchSmartphoneByName() {

        Product[] expected = new Product[]{smartphone3};
        Product[] actual = productManager.searchBy("IPhone11");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchSmartphoneByManufacturer() {

        Product[] expected = new Product[]{smartphone3};
        Product[] actual = productManager.searchBy("Apple");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchProductIfNotExist() {

        Product[] expected = new Product[]{};
        Product[] actual = productManager.searchBy("Blueberry");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchAllItemsByName() {

        Product[] expected = new Product[]{book2, book6};
        Product[] actual = productManager.searchBy("Подсознание");
        assertArrayEquals(expected, actual);
    }
}
