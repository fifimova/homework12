package skypro.java.course1.homework12;

public class Main {

    public static void main(String[] args) {
        Author king = new Author("Стивен", "Кинг");
        Book theStand = new Book("Противостояние", king , 2013);
        theStand.setYear(1978);
        System.out.println("theStand.getYear() = " + theStand.getYear());

        Author arden = new Author("Лия", "Арден");
        Book brideOfNovember = new Book("Невеста ноября", arden, 2022);
    }
}
