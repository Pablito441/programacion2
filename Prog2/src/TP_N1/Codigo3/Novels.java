package TP_N1.Codigo3;

class Novels extends Book {
    // New attribute
    private String type;

    // Constructor
    public Novels(String title, String author, String type) {
        super(title, author);
        this.type = type;
    }

    // Method to print novel information
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Type of novel: " + type);
    }
}
