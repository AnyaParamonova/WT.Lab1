package task12;

/**
 * Created by Anastasia_Paramonova on 03.10.2016.
 */

public class Book implements Cloneable, Comparable<Book>{

    private String title;
    private int price;
    private String author;
    private static int edition;
    private int isbn;

    public Book(){

    }

    public Book(String title, String author, int price, int isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public void setIsbn(int isbn){
        this.isbn = isbn;
    }

    public int getIsbn(){
        return isbn;
    }

    @Override
    public int hashCode(){
        int hash = (562351 * price) << 13 | (price * 14461);

        if(title != null){
            hash += title.hashCode();
        }else{
            hash += 929963;
        }

        if(author != null){
            hash *= author.hashCode();
        }else{
            hash *= 38261;
        }

        return hash;
    }

    @Override
    public String toString(){
        return getClass().getName() + "@" + "\ntitle=" + title + ", author=" + author
                        + "\nprice=" + price + ", edition=" + edition;
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

    @Override
    public Object clone() throws CloneNotSupportedException{
        Book book = (Book) super.clone();
        return book;
    }

    public int compareTo(Book other) {
        return this.isbn - other.isbn;
    }
}
