import java.util.Scanner;
public class prima1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah bilangan: ");
        int a = in.nextInt();
        int periksa = 0;
        for(int i = 2; i<a; i++){
            if(a % i == 0){
                periksa++;
            }
        }
        if(periksa==0){
            System.out.println(a+" adalah bilangan prima.");
        }else{
            System.out.println(a+" bukan bilangan prima.");
        
        }
        
    }
    
}
