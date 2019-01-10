import java.util.Scanner;

public class Task11 {
    public static  void task11() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите коэфициенты а,b,c");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double D= b*b - 4*a*c;//дискриминант
        if (a==0)
            System.out.println("Уравнение не является квадратным");
            else if(D>=0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("корни уравнения ");
            System.out.println("x1= "+ x1);
            System.out.println("x2= "+ x2);

        }
            else
            System.out.println("Корней нет");

            return;

        }
}
