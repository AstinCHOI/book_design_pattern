public class Main {
    public static void main(String[] args) {
        // BookShelf bookShelf = new BookShelf(4);
        BookShelf bookShelf = new BookShelf();

        bookShelf.appendBook(new Book("Alchemist"));
        bookShelf.appendBook(new Book("Redis"));
        bookShelf.appendBook(new Book("Machine Learning"));
        bookShelf.appendBook(new Book("Chatting Bot"));

        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}