package task14;

import org.junit.Test;
import task12.Book;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Anastasia_Paramonova on 03.10.2016.
 */
public class BookSortTest {
    @Test
    public void test(){
        Book book1 = new Book("book1", "author1", 100, 1);
        Book book2 = new Book("book2", "author2", 100, 2);
        Book book3 = new Book("book3", "author3", 100, 3);
        Book book4 = new Book("book4", "author4", 100, 4);
        Book book5 = new Book("book5", "author5", 100, 5);

        Object[] expectedResult = {book1, book2, book3, book4, book5};
        Object[] realResult = {book3, book5, book1, book4, book2};
        Arrays.sort(realResult);

        assertArrayEquals(realResult, expectedResult);
    }
}
