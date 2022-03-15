package Lesson10;

public class Message {
    String helloMessage;
    Check check;

    public Message() {
    }

    public Message(String helloMessage, Check check) {
        this.helloMessage = helloMessage;
        this.check = check;
    }

    public String getHelloMessage() {
        return helloMessage;
    }

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    public Check getCheck() {
        return check;
    }

    public void setCheck(Check check) {
        this.check = check;
    }

    @Override
    public String toString() {
        return "Message{" +
                "helloMessage='" + helloMessage + '\'' +
                ", check=" + check +
                '}';
    }
}
