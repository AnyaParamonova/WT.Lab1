package task12.comparators;

import task12.Book;

/**
 * Created by Anastasia_Paramonova on 03.10.2016.
 */
public class TitleComparator extends BookComparator {
    public int compare(Book book1, Book book2) {
        String title1 = book1.getTitle();
        String title2 = book2.getTitle();
        return title1.compareTo(title2);
    }
}
