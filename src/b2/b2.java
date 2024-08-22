package b2;
import java.util.Scanner;

public class b2 {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Nhap vao ky tu: ");
       boolean check = keyboard.hasNext();
       System.out.println("Ky tu co phai la chuoi hay khong: " + check);
    } 
}
