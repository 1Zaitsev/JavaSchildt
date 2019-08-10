package chapter11;

public class ExtendThread {
    public static void main(String[] args) {
        new NewThread2();

        try{
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Главный  опток прерван.");
        }
        System.out.println("Главный поток завершен.");
    }
}
