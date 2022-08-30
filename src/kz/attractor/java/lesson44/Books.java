package kz.attractor.java.lesson44;

import java.util.ArrayList;
import java.util.List;

public class Books {

    public int getRandom() {
        return random;
    }

    private int random;
    List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public Books(){
        books.add(new Book("Pet cemetery", "das", true, null));
        books.add(new Book("the little Prince", "dasdasd", true, null));
        books.add(new Book("complete Java course", "dasdasd", true, null));
    }

    public void getBookByEmployee(){
        bookRandomizer();
        Employees employees = new Employees();
        List<String> allEmployees = new ArrayList<>();
        for (Employees.Employee e: employees.getEmployees()) {
            allEmployees.add(e.getName());
        }
        Employees employees1 = new Employees();
        books.set(random, new Book(null, null, false, allEmployees.get(employees1.getRandom())));
    }

    public void returnBook(){
        for (Book b : books) {
            books.set(random, new Book(b.bookName, b.description, b.inStock, b.name));
        }
    }

    public void bookRandomizer(){
        this.random = (int)(Math.random() * books.size());
    }

    public static class Book {
        private String bookName;
        private String description;
        private Boolean inStock = false;
        private String name;

        public Book (String bookName, String description, Boolean inStock, String name){
            //this(bookName, description, inStock, name);
            this.bookName = bookName;
            this.description = description;
            this.name = name;
            this.inStock = inStock;
        }

        public boolean getInStock() {
            return inStock;
        }

        public void setInStock(boolean inStock) {
            this.inStock = inStock;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBookName() {
            return bookName;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    }

}
