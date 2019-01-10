import java.util.Scanner;

public class Task09 {

    public static void task09() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты первой точки");
        double x1 = sc.nextDouble();
        double y1= sc.nextDouble();
        System.out.println("Введите координаты второй точки");
        double x2 = sc.nextDouble();
        double y2= sc.nextDouble();
        if (y1==y2)
            System.out.println("Дорога ровная");
        else if (x1==x2)
            System.out.println("Дорога отвесная");
        else {
            double k = (y2 - y1) / (x2 - x1);// угловой коэффициент прямой дороги
            if (k > 0.0)
                System.out.println("Дорога на подъем");
            else if (k < 0.0)
                System.out.println("Дорога на спуск");
        }


        return;
        }

}

