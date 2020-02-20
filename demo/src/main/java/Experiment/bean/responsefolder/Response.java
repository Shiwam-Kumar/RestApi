package Experiment.bean.responsefolder;

public class Response {
    public boolean responseCheck;
    public String message;

    public boolean isResponseCheck() {
        return responseCheck;
    }

    public String getMessage() {
        return message;
    }

    public Response(boolean responseCheck, String message) {
        this.responseCheck = responseCheck;
        this.message = message;
    }
}
