package chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try{
            int a = 0;
            int b = 42/ a;
        }catch (Exception e){
            System.out.println("Перехват исключения общего класса Exception");
//        }catch (ArithmeticException e){                           ------ошибка, код недостижим
//            System.out.println("Этот код недостежим");
        }
    }
}
