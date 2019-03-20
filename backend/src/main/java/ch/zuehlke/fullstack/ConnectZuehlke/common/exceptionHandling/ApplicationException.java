package ch.zuehlke.fullstack.ConnectZuehlke.common.exceptionHandling;

public class ApplicationException extends RuntimeException {

    private String problem;

    public ApplicationException(String problem) {
        this.problem = problem;
    }

    public String getProblem() {
        return problem;
    }
}