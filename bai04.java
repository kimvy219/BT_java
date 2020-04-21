package baith1;
import java.util.Scanner;

public class bai04 {
    public static void main(String[] args)
    {
        //Nhập số nguyên dương n
        int n;
        do
        {
            System.out.print("Mời bạn nhập số nguyên dương n:");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
        }while(n<=0);
        
        //1.Liệt kê các ước số của n
        System.out.print("Các ước số của n lần lượt là: ");
        for(int i=1; i<=n/2; i++)
        {
            if(n%i == 0)
            {
                System.out.println(i);
            }
        }
        
        //2.Kiểm tra n có bao nhiêu chữ số
        int k = n;
        int tmp = 0;
        do
        {
            k /=10;
            tmp++;
        }while(k > 0 );
        System.out.println("Số nguyên dương n có " + tmp + " chữ số");
        
        //3.Kiểm tra n có phải số đối xứng không
        int u=0, r;
        for(int temp = n; temp!=0 ; temp = temp/10)
        {
            r=temp%10;
            u=u*10+r;
        }
        if(n == u)
        {
            System.out.println("Số n là số đối xứng!");
        }
        else
        {
            System.out.println("Số n không phải là số đối xứng!");
        }
        
        //4.Kiểm tra n có phải là số chính phương hay không
        int j = 0;
        boolean bol = false;
        while(j*j <= n)
        {
            if(j*j == n)
                bol = true;
            ++j;
        }
        if(bol == true)
            System.out.println("Số n là số chính phương!");
        else
            System.out.println("Số n không phải là số chính phương!");
    }
}
