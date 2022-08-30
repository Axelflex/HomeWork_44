package kz.attractor.java.lesson44;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private Boolean inStock;
    private Employees name;
    List<Book> books = new ArrayList<Book>();

    public Books(){
        books.add(new Book("sdasd", "dasdasd"));
        books.add(new Book("sdad", "dasdasd"));
        books.add(new Book("sdasd", "dasdasd"));
    }

    public static class Book {
        private String bookName;
        private String description;

        public Book (String bookName, String description){
            this.bookName = bookName;
            this.description = description;

        }

    }

}
