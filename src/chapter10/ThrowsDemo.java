package chapter10;

public class ThrowsDemo{
    static void throwOne() throws IllegalArgumentException{
        System.out.println("В теле метода throwOne().");
        throw new IllegalArgumentException("Demo");
    }

    public static void main(String[] args) {
        try{
            throwOne();
        }catch (IllegalArgumentException e){
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}
