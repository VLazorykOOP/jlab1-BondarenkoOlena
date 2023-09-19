import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        /*Задано масив цілих чисел A(n), n <= 300 (числа в масиві можуть бути однаковими).
        Розробити програму, яка знаходить і друкує найдовший ланцюжок однакових чисел*/
        Scanner in = new Scanner(System.in);
        System.out.print("Array size n = ");
        int n = in.nextInt();
        int []myArray = new int[n];
        for (int i = 0; i < n; i++){
            myArray[i] = in.nextInt();
        }
        int count = 1;
        int tcount = 1;
        int index = 0;
        int tindex = 0;
        for (int i = 1; i < n; i++){
            if ((myArray[i] == myArray[i - 1]) && i != n - 1){
                tcount++;
            } else if(i == n - 1) {
                if (myArray[i] == myArray[i - 1]){
                    tcount++;
                }
                if (tcount > count){
                    count = tcount;
                    index = tindex;
                }
            } else{
                if (tcount > count){
                    count = tcount;
                    index = tindex;
                }
                tindex = i;
                tcount = 1;
            }
        }
        for (int i = index; i < index + count; i++){
            System.out.print((myArray[i] + " "));
        }
    }
}