package entity;
import java.time.LocalDate;

public class BorrowRecord {
    private String recordId;
    private LocalDate loanDate;
    private Integer bookId;
    private Integer userId;
    private LocalDate returnDate;
    private String returnStatus;

    //Constructor
    public BorrowRecord(String recordId,LocalDate loanDate,Integer bookId,Integer userId,LocalDate returnDate,String returnStatus) {
        this.recordId = recordId;
        this.loanDate = loanDate;
        this.bookId = bookId;
        this.userId = userId;
        this.returnDate = returnDate;
        this.returnStatus = returnStatus;
    }

    public BorrowRecord(LocalDate loanDate,Integer bookId, Integer userId,LocalDate returnDate,String returnStatus) {
        this.recordId = null;
        this.loanDate = loanDate;
        this.bookId = bookId;
        this.userId = userId;
        this.returnDate = returnDate;
        this.returnStatus = returnStatus;
    }

    // Getter for recordId
    public String getRecordId() {
        return recordId;
    }

    // Getter/Setter for loandate
    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate newLoanDate) {
        LocalDate mindate = LocalDate.of(0,1,1);
        if (newLoanDate != null && newLoanDate.isAfter(mindate)) {
            this.loanDate = newLoanDate;
        } else {
            System.out.println("Invalid loan date");
        }
    }

    // Getter/Setter for bookId
    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer newBookId) {
        if (newBookId != null) {
            this.bookId = newBookId;
        } else {
            System.out.println("Invalid book ID");
        }
    }

    // Getter/Setter for userId
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer newUserId) {
        if (newUserId != null) {
            this.userId = newUserId;
        } else {
            System.out.println("Invalid User ID");
        }
    }

    // Getter/Setter for returnDate
    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate newDate) {
        LocalDate mindate = LocalDate.of(0,1,1);
        if (newDate != null && newDate.isAfter(mindate)) {
            this.returnDate = newDate;
        } else {
            System.out.println("Invalid return date");
        }
    }

    // Getter/Setter for returnStatus
    public String getStatus() {
        return returnStatus;
    }

    public void setStatus(String newStatus) {
        if (newStatus != null) {
            this.returnStatus = newStatus;
        } else {
            System.out.println("Invalid status");
        }
    }
}
