package principle_01_single_responsibility;

public class BookPrinter {
    private Book book;

    public BookPrinter(Book book) {
        this.book = book;
    }

    public void print(){
        System.out.println(book.getTitle());
    }

    public static void main(String[] args) {
        Book book = new Book("title", "lorem ipsum dolores");
        BookPrinter printer = new BookPrinter(book);
        printer.print();
    }
}
