package ch.zuehlke.fullstack.ConnectZuehlke.common.exceptionHandling;

public class ProblemDto {

    private String title;
    private int status;
    private String detail;

    public ProblemDto(String title, int status, String detail) {
        this.title = title;
        this.status = status;
        this.detail = detail;
    }

    public String getTitle() {
        return title;
    }

    public int getStatus() {
        return status;
    }

    public String getDetail() {
        return detail;
    }
}