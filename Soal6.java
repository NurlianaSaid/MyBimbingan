import java.util.Scanner;
public class kondisiInputan {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while(true){
            System.out.print("Masukkan angka antara 1 dan 100: ");
            int a = in.nextInt();
            
            if(a<1 || a>100){
                System.out.println("Input tidak valid. Coba lagi.");
                continue;
            }
            
                System.out.println("Terima kasih! Angka yang Anda masukkan adalah "+a);
                break;
        
        }
        
    }
    
}
