package task12;

/**
 * Created by Anastasia_Paramonova on 03.10.2016.
 */

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    @Override
    public int hashCode(){
        int hash = (5649156 * price) << 13 | (price * 14461) >> 19;
        if(title != null){
            hash += title.hashCode();
        }else{
            hash += 15646511;
        }
        if(author != null){
            hash *= author.hashCode();
        }else{
            hash *= 656416564;
        }

        return hash;
    }

    @Override
    public String toString(){
        return getClass().getName() + "@" + "title: " + title + ", author: " + author
                        + ", price: " + price + ", edition: " + edition;
    }

    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object == null || this.getClass() != object.getClass()){
            return false;
        }

        Book book = (Book)object;
        if(book.price != price){
            return false;
        }

        if(book.author == null){
            if(author != null){
                return false;
            }
        } else{
            if(!book.author.equals(author)){
                return false;
            }
        }

        if(book.title == null){
            if(title != null){
                return false;
            }
        } else{
            if(!book.title.equals(title)){
                return false;
            }
        }

        return true;
    }
}
