import java.util.Scanner;
public class latihanyes {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ystem.out.println("Hello, World!");
        int a = in.nextInt();
        for (int i = 1; i<=a; i++){
            if(i%2 == 0){
                System.out.println(i+" - Genap");
            }else{
                System.out.println(i+" - Ganjil");
            }
        }
    }
    
}
