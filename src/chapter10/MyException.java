package chapter10;

public class MyException extends Exception {
    private int detail;

    MyException(int a){
        this.detail = a;
    }

    @Override
    public String toString() {
        return "MyException[" + detail +"]";
    }
}
