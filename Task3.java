package JavaSem4Dom;

//В калькулятор добавьте возможность отменить последнюю операцию.

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        System.out.println("Введите через Enter число, вырожение и второе число, после чего выйдет итог. Если хотите закончить, наберите КОНЕЦ, если отменить - ОТМЕНА"); 

        Scanner Sc = new Scanner(System.in);

        System.out.println("Введите первое число: "); 
        double a = Sc.nextInt();

        Scanner Sk = new Scanner(System.in, "Cp866");
        System.out.println("Введите выражение: ");        
        String expression = Sk.nextLine();
        
        double b = 0.0, res = 0.0;
        double resEnd = 0;

        while (!(expression.equals("КОНЕЦ"))){

            if (expression.equals("ОТМЕНА")) {
                a = resEnd;
                System.out.printf(a+"\n");
                System.out.println("Введите выражение или наберите КОНЕЦ или ОТМЕНА: ");        
                String expression1 = Sk.nextLine();
                expression = expression1;    
            } 
            resEnd = res;

            System.out.println("Введите число: "); 
            b = Sc.nextInt();

            if (expression.equals(String.valueOf("+"))){
                res = a+b;    
                System.out.printf("Сумма чисел %s и %s равна %s", a, b, res+"\n");
            }
            else if (expression.equals(String.valueOf("-"))){
                res = a-b;
                System.out.printf("Разница чисел %s и %s равна %s", a, b, res+"\n");
            }
            else if (expression.equals(String.valueOf("*"))){
                res = a*b;    
                System.out.printf("Произведение чисел %s и %s равно %s", a, b, res+"\n");
            }
            else if (expression.equals(String.valueOf("/"))){
                res = a/b;    
                System.out.printf("Деление чисел %s и %s равно %s", a, b, res+"\n");
            }
            a = res;
            System.out.println("Введите выражение или наберите КОНЕЦ или ОТМЕНА: ");        
            String expression1 = Sk.nextLine();
            expression = expression1;

        }
    }
} 