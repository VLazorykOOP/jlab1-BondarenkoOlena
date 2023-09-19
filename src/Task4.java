import java.util.Arrays;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        /*Задано текст із малих латинських букв, слова в якому розділені пробілами і розділовими знаками.
        Розробити програму, яка знаходить і друкує всі слова,
        букви в яких розміщені в алфавітному порядку. */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = in.nextLine();
        String []words = text.split(" ");
        for (int i = 0; i < words.length; i++){
            String word = words[i];
            char []inorder = word.toCharArray();
            Arrays.sort(inorder);
            if (Arrays.equals(word.toCharArray(), inorder)){
                System.out.print(word + " ");
            }
        }
    }
}
