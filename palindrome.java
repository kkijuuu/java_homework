import java.util.Scanner;

public class palinrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();
        
        word = word.toLowerCase();
        
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        
        if (word.equals(reversed)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}