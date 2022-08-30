package kz.attractor.java.lesson44;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Employees {
    public int getRandom() {
        return random;
    }

    private int random;
    private Employee employee = new Employee("Maks", "Shvechkov");
    private LocalDateTime currentDateTime = LocalDateTime.now();
    private List<Employee> employees = new ArrayList<>();
    Books books = new Books();
    public Employees() {
        employees.add(new Employee("Marco", getBook()));
        employees.add(new Employee("Winston", "Duarte", getBook()));
        employees.add(new Employee("Amos", "Burton", "'Timmy'", getBook()));
        employees.get(2).setIsHavingBook(true);
    }

    public String getBook(){
        List<String> takenBooks = new ArrayList<>();
        for (Books.Book b : books.getBooks()) {
            takenBooks.add(b.getBookName());
        }
        Books books1 = new Books();
        if(takenBooks.get(books1.getRandom()) == null){
            return null;
        }
        return takenBooks.get(books1.getRandom());
    }
    public void employeeRandomizer(){
        this.random = (int)(Math.random() * employees.size());
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setUser(Employee employee) {
        this.employee = employee;
    }

    public LocalDateTime getCurrentDateTime() {
        return currentDateTime;
    }

    public void setCurrentDateTime(LocalDateTime currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public static class Employee{
        private String name;
        private String lastName;
        private String middleName = null;
        private Boolean isHavingBook;
        private String bookName;
        public Employee(String name, String bookName) { this(name, null, null, bookName); }

        public Employee(String name, String lastName, String bookName) {
            this(name, lastName, null, bookName);
        }

        public Employee(String name, String lastName, String middleName, String book){
            this.name = name;
            this.lastName = lastName;
            this.middleName = middleName;
            this.bookName = book;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public boolean isHavingBook() {
            return isHavingBook;
        }

        public void setIsHavingBook(boolean isHavingBook) {
            this.isHavingBook = isHavingBook;
        }

        public String getBookName() {
            return bookName;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }
    }
}
