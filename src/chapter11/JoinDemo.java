package chapter11;

public class JoinDemo {
    public static void main(String[] args) {
        NewThread3 ob1 = new NewThread3("One");
        NewThread3 ob2 = new NewThread3("Two");
        NewThread3 ob3 = new NewThread3("Three");

        System.out.println("Поток One запущен: " + ob1.t.isAlive());
        System.out.println("Поток Two запущен: " + ob2.t.isAlive());
        System.out.println("Поток Three запущен: " + ob3.t.isAlive());

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        System.out.println("Поток One ззапущен: " + ob1.t.isAlive());
        System.out.println("Поток Two ззапущен: " + ob2.t.isAlive());
        System.out.println("Поток Three ззапущен: " + ob3.t.isAlive());
        System.out.println("Главный поток завершен");
    }
}
