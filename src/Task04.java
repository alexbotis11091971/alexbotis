import java.util.Scanner;

    public class Task04 {

        public static  void task04() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите координаты точки x,y");
          double x = sc.nextDouble();
          double y = sc.nextDouble();
            if (x>0 &y>0){
                System.out.println("Точка с координатами "+ x + y+ " лежит в 1 четверти");

            }
            else if (x<0 && y>0)
                System.out.println("Точка с координатами "+ x + y+ " лежит в 2 четверти");
            else if (x<0 && y<0)
                System.out.println("Точка с координатами "+ x + y+ " лежит в 3 четверти");

            else if(x>0 && y<0)
                System.out.println("Точка с координатами "+ x + " " +y+ "  лежит в 4 четверти");

            else if(x==0)
                System.out.println("Точка с координатами " + x + " " +y+ "лежит на оси ОУ");
            else if(y==0)
                System.out.println("Точка с координатами " + x + " " +y+ "лежит на оси ОХ");


            return;







        }
    }

