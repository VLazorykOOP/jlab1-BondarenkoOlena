import java.util.Scanner;
import java.lang.Math;
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Lab 1 Java : Task 1");
        /*За введеними значеннями обчислити та вивести на екран значення виразу.
        Обчислення виконати у трьох варіантах:
                1) вхідні дані дійсного типу, результат – дійсного;
                2) вхідні дані цілого типу, результат – дійсного;
                3) вхідні дані дійсного типу, результат – цілого*/
        double result1 = doubleToDouble();
        System.out.println(result1);
        double result2 = intToDouble();
        System.out.println(result2);
        int result3 = doubleToInt();
        System.out.println(result3);
    }
    static double doubleToDouble(){
        Scanner in = new Scanner(System.in);
        System.out.print("x = ");
        double x = in.nextDouble();
        System.out.print("y = ");
        double y = in.nextDouble();
        return x  * y + (x - y) * (Math.pow((x + y), 3) / (Math.pow(x, 2) + Math.pow(y, 2)));
    }
    static double intToDouble(){
        Scanner in = new Scanner(System.in);
        System.out.print("x = ");
        int x = in.nextInt();
        System.out.print("y = ");
        int y = in.nextInt();
        return x  * y + (x - y) * (Math.pow((x + y), 3) / (Math.pow(x, 2) + Math.pow(y, 2)));
    }
    static int doubleToInt(){
        Scanner in = new Scanner(System.in);
        System.out.print("x = ");
        double x = in.nextDouble();
        System.out.print("y = ");
        double y = in.nextDouble();
        return (int)Math.round(x  * y + (x - y) * (Math.pow((x + y), 3) / (Math.pow(x, 2) + Math.pow(y, 2))));
    }
}
