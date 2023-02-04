package class17.homework;

public class Book {
    /*
    Write Book class that will have instance variables and 2 Constructors.
    While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
     */
    String author;
    String title;
    int pages;
int year;
    Book(String bookAuthor, String bookTitle) {
        author = bookAuthor;
        title = bookTitle;
    }

    Book(String bookAuthor, String bookTitle, int numPages, int publishYear) {
        pages = numPages;
        year = publishYear;
        author = bookAuthor;
        title = bookTitle;
    }

    void bookInfo () {
        System.out.println("Author " + author + " Title " + title
                + " number of pages " + pages + " year of publishing "
                + year);
    }
    void bookRecomend() {
        System.out.println("I strongly recomend to read " + title + " by " + author);
    }
}
