import java.util.Scanner;

public class Task10 {

    public static  void task10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер дня квартиры");
        int N= sc.nextInt();
        System.out.println("Введите кол-во квартир на этаже");
        int M= sc.nextInt();
        int n= N%(9*M);
        int n1= (int) (N/(9*M));
        if (n>0)  n1=n1+1;
        System.out.println( "Номер подъезда" +n1);
        return;

        }



}
