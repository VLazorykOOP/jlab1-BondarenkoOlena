import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        /*Задана матриця X(n,n), n <= 15.
        Розробити програму, яка будує логічний вектор L(n) за правилом:
                L(i) = true, якщо в i -му рядку цієї матриці кількість від’ємних елементів більша
                від кількості додатних, інакше – L(i) = false*/
        Scanner in = new Scanner(System.in);
        System.out.print("Matrix size n = ");
        int n = in.nextInt();
        int [][]X = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                X[i][j] = in.nextInt();
            }
        }
        int positivCounter = 0;
        boolean []L = new boolean[n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (X[i][j] >= 0){
                    positivCounter++;
                }
            }
            if(positivCounter < n - positivCounter){
                L[i] = true;
            } else{
                L[i] = false;
            }
            positivCounter = 0;
            System.out.print((L[i] + " "));
        }
    }
}
