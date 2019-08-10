package chapter11;

public class NewThread3 implements Runnable {
    String name;
    Thread t;

    NewThread3(String threadName){
        this.name = threadName;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start();
    }

    @Override
    public void run() {
        try{
            for (int i = 5; i > 0 ; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершен.");
    }
}
