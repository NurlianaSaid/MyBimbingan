import java.util.Scanner;

public class hurufVokal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan sebuah kalimat: ");
        String a = in.nextLine().toLowerCase();
        String[] b = {"a","i","u","e","o"};
        int tampung = 0;
        for(char c : a.toCharArray()){
            for(String vokal : b){
                if(String.valueOf(c).equals(vokal)){
                    tampung++;
                }
            }
        }
        System.out.println("Jumlah huruf vokal adalah: " + tampung);
    }
}
