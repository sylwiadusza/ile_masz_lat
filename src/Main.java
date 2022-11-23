import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ile masz lat?");
        int age;
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();
        boolean isAdult = false;
        if (age >= 18) {
            System.out.println("Jestes pelnoletni!");
            isAdult = true;
        } else {
            System.out.println("Nie jestes pelnoletni");
        }
        if (isAdult) {
            System.out.println("Witaj w gronie starców");
        }
    }
}