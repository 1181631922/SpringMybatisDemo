package com.fanyafeng.exception;

/**
 * Author： fanyafeng
 * Data： 16/10/24 10:23
 * Email: fanyafeng@live.cn
 */
public class CustomException extends Exception {
    public String message;

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public CustomException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
