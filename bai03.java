package baith1;
import java.util.Scanner;
import java.lang.Math;
public class bai03 {
    public static void main(String[] args)
    {
        int a,b,c;//Khai báo 3 cạnh của tam giác
        //Viết vòng lặp nhập vào với điều kiện 3 số nhập vào phải tạo thành 1 tam giác
        do
        {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập lần lượt 3 cạnh của tam giác: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        }while(a>=b+c || b>=a+c || c>=a+b);
        
        
        //Tính chu vi tam giác
        int p = a+b+c;
        
        
        //Tính diện tích tam giác
        int k = p/2;
        double s = Math.sqrt(k*(k-a)*(k-b)*(k-c));
        
        
        //In ra màn hình kết quả
        System.out.println("Chu vi của tam giác là: " + p);
        System.out.println("Diện tích của tam giác là: " + s);
        
        
        
        
        
    }
}