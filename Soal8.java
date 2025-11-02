import java.util.Scanner;

public class hurufBalik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan kata/kalimat: ");
        String input = in.nextLine();
        StringBuilder sb = new StringBuilder(input);
        String hasil = sb.reverse().toString();
        System.out.println("Hasil membalikkan: " + hasil);
    }
}
