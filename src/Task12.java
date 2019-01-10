import java.util.Scanner;

public class Task12 {
    public static  void task12() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите шестизначное число");
        int n = sc.nextInt();
        int s1=0;
        int s2=0;
        for (int i=1; i<=6; i++){
            int temp=n%10;
             n= n- temp;
            if (i<=3)
                s2=s2+ temp;
            else s1=s1+temp;
            n= (int)n/10 ;
        }
         if (s1==s2)
             System.out.println("да");
         else
             System.out.println("нет");
        return;
        }

}
