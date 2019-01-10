import java.util.Scanner;




    public class Task02 {

        public static  void task02() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите время суток");
            int n = sc.nextInt();
            if (n>24){
                 System.out.println("Поры дня не существует");
                 return;
            }
           if (n>=6 && n<=12)
                    System.out.println("Доброе утро");
                   else if (n>=12 && n<=20)

                    System.out.println("Добрый день");
                   else

                    System.out.println("Доброй ночи");



            }
        }





