import java.util.Scanner;

public class Task07 {
    public static  void task07() {
        //Scanner sc = new Scanner(System.in);
       // System.out.println("Введите символ");
        //Char c = sc.nextChar();
        char c= '7';
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))

            System.out.println("введенный символ -кирилица");
            else if ((c >= 'А' && c <= 'Я') || (c >= 'а' && c <= 'я'))
            System.out.println("введенный символ - латиница");
            else if (Character.isDigit(c))
            System.out.println("введенный символ - цифра");
            else
            System.out.println("введенный символ -невозможно определить");

return;


    }

}
