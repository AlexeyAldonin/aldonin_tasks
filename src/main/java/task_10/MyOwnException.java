package task_10;

public class MyOwnException extends Exception {
    String message;
    MyOwnException (String message) {
        this.message = message;
    }
}
