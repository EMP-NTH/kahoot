package com.empnth.kahootsocket.Model;

public class MessageModel {
    private String message;
    private String fromLogin;

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "MessageModel{" +
                "message='" + message + '\'' +
                ", fromLogin='" + fromLogin + '\'' +
                '}';
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFromLogin() {
        return fromLogin;
    }

    public void setFromLogin(String fromLogin) {
        this.fromLogin = fromLogin;
    }

    public MessageModel(String message, String fromLogin) {
        this.message = message;
        this.fromLogin = fromLogin;
    }
}
