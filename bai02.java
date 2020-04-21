package baith1;
import java.util.Scanner;
//import java.lang.Math;
public class bai02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//Khai báo biến để nhận giá trị từ bàn phím
        
        int x, n;//Khai báo 2 biến
        System.out.print("Mời bạn nhập lần lượt các số x và n:");//Nhập 2 biến từ bàn phím
        x = sc.nextInt();
        n = sc.nextInt();
        
        double S = 0;//Khai báo tổng
        
        //Tính tổng S(n)
        for(int i=1; i <= n ;i++)
        {
            int m=0;
            for(int j=1; j<=i ; j++)
            {
                m=m+j;
            }
            
            S = S + (Math.pow(x,i)/m);
        }
        //In tổng ra màn hình
        System.out.println("Tổng S = " + S);
    }
}
