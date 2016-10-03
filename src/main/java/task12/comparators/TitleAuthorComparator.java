package task12.comparators;

import task12.Book;

/**
 * Created by Anastasia_Paramonova on 03.10.2016.
 */
public class TitleAuthorComparator extends BookComparator{
    public int compare(Book book1, Book book2) {
        String title1 = book1.getTitle();
        String title2 = book2.getTitle();
        int firstCompare = title1.compareTo(title2);
        if(firstCompare != 0){
            return firstCompare;
        }

        String author1 = book1.getAuthor();
        String author2 = book2.getAuthor();
        return author1.compareTo(author2);
    }
}
