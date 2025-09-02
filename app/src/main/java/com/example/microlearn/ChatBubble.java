package com.example.microlearn;

public class ChatBubble {
    private int id;
    private String message;
    private boolean isUser;


    public ChatBubble(int id, String message, boolean isUser) {
        this.id = id;
        this.message = message;
        this.isUser = isUser;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public boolean isUser() {
        return isUser;
    }
    public void setUser(boolean isUser) {
        this.isUser = isUser;
    }

    @Override
    public String toString() {
        return "ChatBubble{" + "id=" + id + ", message=" + message + ", isUser=" + isUser + '}';
    }
}
