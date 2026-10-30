package entity;

public class Book {
    private Integer bookId;
    private String title;
    private Integer publishYear;
    private String author;
    private String category;
    private String status;

    // Constructor Book with title is required for all case
    // Others field if unknow will be set to "Unknown"/null.
    // By default status will be "AVAILABLE".

    public Book(Integer bookId, String title, Integer publishYear, String author, String category) {
        this.bookId = bookId;
        this.title = title;
        this.publishYear = publishYear;
        this.author = author;
        this.category = category;
        this.status = "AVAILABLE";
    }

    public Book(String title, Integer publishYear, String author, String category) {
        this.bookId = null;
        this.title = title;
        this.publishYear = publishYear;
        this.author = author;
        this.category = category;
        this.status = "AVAILABLE";
    }

    public Book(Integer bookId, String title ) {
        this.bookId = bookId;
        this.title = title;
        this.publishYear = null;
        this.author = "Unknown";
        this.category = "Unknown";
        this.status = "AVAILABLE";

    }

    // Getter for BookId
    public Integer getBookId() {
        return bookId;
    }

    // Getter/Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        if (newTitle != null) {
            this.title = newTitle;
        } else {
            System.out.println("Title cannot null");
        }
    }

    // Getter/Setter for publishYear
    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer newYear) {
        if ( newYear != null && newYear > 0) {
            this.publishYear = newYear;
        } else {
            System.out.println("Year cannot be negative");
        }
    }

    // Getter/Setter for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        if (newAuthor != null) {
            this.author = newAuthor;
        } else {
            System.out.println("Author name can't be null");
        }
    }

    // Getter/Setter for category
    public String getCategory() {
        return category;
    }

    public void setCategory(String newCategory) {
        if (newCategory != null) {
            this.category = newCategory;
        } else {
            System.out.println("Category can't be null");
        }
    }

    // Getter/Setter for status
    public String getStatus() {
        return status;
    }

    public void setStatus() {
        if (status.equals("AVAILABLE")) {
            this.status = "UNAVAILABLE";
        } else {
            this.status = "AVAILABLE";
        }
    }
}
