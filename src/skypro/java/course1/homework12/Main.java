package skypro.java.course1.homework12;

public class Main {

    public static void main(String[] args) {
        Author king = new Author("Стивен", "Кинг");
        Book theStand = new Book("Противостояние", king , 2013);
        theStand.setYear(1978);
        System.out.println("theStand.getYear() = " + theStand.getYear());

        Author arden = new Author("Лия", "Арден");
        Book brideOfNovember = new Book("Невеста ноября", arden, 2022);

        Author arden2 = new Author("Лия", "Арден");
        Book brideOfNovember2 = new Book("Невеста ноября", arden, 2022);

        System.out.println(king);
        System.out.println(theStand);
        System.out.println(king.equals(arden));
        System.out.println(arden.equals(arden2));
        System.out.println(theStand.hashCode());
        System.out.println(arden.hashCode());
        System.out.println(arden2.hashCode());
    }
}
