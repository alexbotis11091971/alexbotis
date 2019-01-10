import java.util.Scanner;

public class Task05 {
    public static  void task05() {
    int den;
    int mesyac;
    int god;
String r= " ";
    Scanner sc = new Scanner(System.in);
        System.out.println("Введите день");
    den = sc.nextInt();
        System.out.println("Введите месяц");
    mesyac = sc.nextInt();
        System.out.println("Введите год");
    god = sc.nextInt();
        System.out.println("Дата вашего дня рождения: "+den+" "+mesyac+" "+god);
       int g= god%12+1;
       switch (g){
           case 1: System.out.println(" год обезьяны"); break;
           case 2: System.out.println(" год петуха"); break;
           case 3: System.out.println(" год собаки"); break;
           case 4: System.out.println(" год свиньи"); break;
           case 5: System.out.println(" год крысы"); break;
           case 6: System.out.println(" год  быка"); break;
           case 7: System.out.println(" год  тигра"); break;
           case 8: System.out.println(" год кролика"); break;
           case 9: System.out.println(" год дракона"); break;
           case 10: System.out.println(" год змеи"); break;
           case 11: System.out.println(" год лошади"); break;
           case 12: System.out.println(" год козы"); break;
       }

        double i= (double)( mesyac + (double)(den)/100);

        if (1.22 <= i && i <= 2.18)
        {
            r = "водолей";
        }
        else if (2.19 <= i && i <= 3.20)
        {
            r = "рыбы";
        }
        else if (3.21<=i&& i<=4.20)
        {
            r = "овен";
        }
        else if (4.21 <= i && i <= 5.20)
        {
            r = "Tелец";
        }
        else if (5.21 <= i && i <= 6.20)
        {
            r = "близнецы";
        }
        else if (6.21 <= i && i <= 7.22)
        {
            r = "рак";
        }
        else if (7.23 <= i && i <= 8.22)
        {
            r = "лев";
        }
        else if (8.23 <= i && i <= 9.23)
        {
            r = "дева";
        }
        else if (9.24 <= i && i <= 10.23)
        {
            r = "весы";
        }
        else if (10.24 <= i && i <= 11.21)
        {
            r = "скорпион";
        }
        else if (11.22 <= i && i <= 12.21)
        {
            r = "стрелец";
        }
        else if (12.22 <= i || i <= 19.01)
        {
            r = "козерог";
        }
        else
        {
            r = "проверьте дату рождения";
        }
        System.out.println(r);
        return ;

    }


}
