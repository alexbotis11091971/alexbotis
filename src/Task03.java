import java.util.Scanner;

public class Task03 {
    public static  void task03() {
        String [][] Menu= { {"корова","Му"},{"бык","Мэ"},{"свинка","Хрю"},{"коза","ме"},{"козел","Бе"},{"Петух","кукареку"},{"курица","Коко"},{"Гусь","Гагага"},{"Утка","крякря"},{"Еж","фрр"}};
        Scanner sc = new Scanner(System.in);
        System.out.println("               введите цифру из Меню:");
        for (int i=0; i<10; i++){
            System.out.println (i+"         "+ Menu [i][0]);


        }
        int d = sc.nextInt();
        System.out.println (Menu [d][0]+"  говорит    " +Menu [d][1]);
        return;
    }

    }