package b3;
import java.util.Scanner;

public class b3 {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Nhap vao so: ");
       boolean check = keyboard.hasNextInt();
       System.out.println("Ky tu co phai la so nguyen hay khong: " + check);
    } 
}
