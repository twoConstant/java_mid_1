package ex.ex4;

public enum HttpStatus {
    OK(200, "OK"), BAD_REQUEST(400, "Bad Request"), NOT_FOUND(404, "Not Found"), INTERAL_SERVER_ERROR(500, "Internal setver Error");

    // 멤버 변수
    final int code;
    final String message;


    // 생성자
    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return this.code >= 200 && this.code < 300;
    }

    public static HttpStatus findByCode(int code) {
        HttpStatus[] httpStatuses = HttpStatus.values();
        for (HttpStatus status : httpStatuses) {
            if(status.code == code) {
                return status;
            }
        }
        return null;
    }

}
