import java.util.Scanner;

public class Task06 {

        public static  void task06() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите год");
            int d = sc.nextInt();
            int d1= d%4;
            int d2= ( d-(d%100))%400;
            System.out.println ( d2);
            if (d1==0 && d2==0) {
                System.out.println("Год " + d+ " высокосный и содержит 366 дней");
            }

            else
                System.out.println("Год " + d+ " невысокосный и содержит 365 дней");




        }
    }



