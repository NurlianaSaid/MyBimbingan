import java.util.Scanner;

public class BagiMenurun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi pola: ");
        int tinggi = scanner.nextInt();
        //scanner.close();

        for (int i = 0; i < tinggi; i++) {
            for (int j = tinggi - i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
