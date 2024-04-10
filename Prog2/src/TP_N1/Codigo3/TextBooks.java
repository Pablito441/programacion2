package TP_N1.Codigo3;

class TextBooks extends Book {
    // New attribute
    private String course;

    // Constructor
    public TextBooks(String title, String author, String course) {
        super(title, author);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Method to print textbook information
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Course: " + course);
    }
}