import java.util.Scanner;

public class Task08 {

    public static void task08() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа  x,y");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (x % 2 == 0 && y % 2 == 0)
            System.out.println("Числа " + (int)x + " " +(int) y + " четные");
        else if (x % 2 != 0 && y % 2 != 0)
            System.out.println("Числа " +(int) x + " " +(int) y + " нечетные");
        else return;


    }
}
