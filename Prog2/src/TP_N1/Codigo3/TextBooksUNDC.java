package TP_N1.Codigo3;

class TextBooksUNDC extends TextBooks {
    // New attribute
    private String faculty;

    // Constructor
    public TextBooksUNDC(String title, String author, String course, String faculty) {
        super(title, author, course);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    // Method to print UNAL textbook information
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Faculty: " + faculty);
    }
}
