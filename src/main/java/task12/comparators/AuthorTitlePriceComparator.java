package task12.comparators;

import task12.Book;

/**
 * Created by Anastasia_Paramonova on 03.10.2016.
 */
public class AuthorTitlePriceComparator extends BookComparator {
    public int compare(Book book1, Book book2) {
        String author1 = book1.getAuthor();
        String author2 = book2.getAuthor();
        int firstCompare = author1.compareTo(author2);
        if(firstCompare != 0){
            return firstCompare;
        }

        String title1 = book1.getTitle();
        String title2 = book2.getTitle();
        int secondCompare =  title1.compareTo(title2);
        if(secondCompare != 0){
            return secondCompare;
        }

        int price1 = book1.getPrice();
        int price2 = book2.getPrice();
        return price1 - price2;
    }
}
