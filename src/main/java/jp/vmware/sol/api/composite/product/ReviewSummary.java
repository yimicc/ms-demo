package jp.vmware.sol.api.composite.product;

public class ReviewSummary {
    private int reviewId;
    private String author;
    private String subject;

    public ReviewSummary(int reviewId, String author, String subject) {
        this.reviewId = reviewId;
        this.author = author;
        this.subject = subject;
    }


    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
