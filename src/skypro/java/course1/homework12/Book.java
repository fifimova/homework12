package skypro.java.course1.homework12;

public class Book {
    String title;
    Author name;
    int year;

    public Book (String title, Author name, int year) {
        this.title = title;
        this.name = name;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}