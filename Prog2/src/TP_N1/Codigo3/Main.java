package TP_N1.Codigo3;

public class Main {
    public static void main(String[] args) {
        // Creating instances of each type of book
        Book book1 = new TextBooks("Linear Algebra", "John Smith", "Mathematics");
        Book book2 = new TextBooksUNDC("Java Programming", "Anna Johnson", "Computer Science", "Engineering");
        Book book3 = new Novels("One Hundred Years of Solitude", "Gabriel García Márquez", "Realistic");

        // Printing information for each book
        System.out.println("Textbook:");
        book1.printInfo();
        System.out.println("\nUNAL Textbook:");
        book2.printInfo();
        System.out.println("\nNovel:");
        book3.printInfo();
    }
}