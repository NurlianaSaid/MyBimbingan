import java.util.Scanner;

public class Perkalian1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Buat tabel perkalian sampai: ");
        int a = in.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
