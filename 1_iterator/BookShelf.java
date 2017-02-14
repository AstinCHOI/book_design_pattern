import java.util.ArrayList;


public class BookShelf implements Aggregate {
    // private Book[] books;
    private ArrayList<Book> books;
    private int last = 0;
    
    public BookShelf() {
        this.books = new ArrayList<Book>();
    }

    // public BookShelf(int maxsize) {
    //     this.books = new Book[maxsize];
    // }

    public Book getBookAt(int index) {
        // return books[index];
        return this.books.get(index);
    }
    public void appendBook(Book book) {
        // this.books[last] = book;
        // last++;
        this.books.add(book);
    }
    public int getLength() {
        // return last;
        return this.books.size();
    }
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}