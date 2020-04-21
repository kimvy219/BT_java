package baith1;
import java.util.Scanner;
public class bai08 {
    public static boolean isnguyento(int m)
    {
        if(m <= 1)
            return false;
        else
        {
            int tmp = 0;
            for(int i = 2; i<m; i++)
            {
                if(m%i == 0)
                    tmp++;
            }
            if(tmp > 0)
                return false;
            else
                return true;
        }
    }
    public static void main(String[] args)
    {
        //Nhập ma trận M có kích thước mxn từ bàn phím
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập kích thước của ma trận :");
        m = sc.nextInt();
        n = sc.nextInt();
        int M[][] = new int[m][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.println("Mời bạn nhập phần tử thứ M[" + i + "][" + j + "] : " );
                M[i][j] = sc.nextInt();
            }
        }
        
        //1. Tìm giá trị nhỏ nhất và lớn nhất của ma trận
        int max,min;
        //Giá trị lớn nhất
        max = M[0][0];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(M[i][j] > max)
                    max = M[i][j];
            }
        }
        System.out.println("Giá trị lớn nhất của ma trận M là: " + max);
        //Giá trị nhỏ nhất
        min = M[0][0];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(M[i][j] < min)
                    min = M[i][j];
            }
        }
        System.out.println("Giá trị nhỏ nhất của ma trận M là: " + min);
        
        //2. In ra màn hình các giá trị nửa tam giác trên đường chéo chính
        //Kiểm tra xem ma trận M có phải là ma trận vuông không, nếu không thì ma trận M không có đường chéo chính
        if(m == n)
        {
            System.out.println("Các giá trị tam giác trên đường chéo chính lần lượt là: ");
            for(int i=0; i<m-1; i++)
            {
                for(int j=i+1; j<m; j++)
                {
                    System.out.print(M[i][j] + " ");
                }
            }
        }
        else
            System.out.println("Ma trận M không có đường chéo chính!");
        
        //3. Tìm tất cả các số nguyên tố của ma trận
        System.out.println("\nCác số nguyên tố của ma trận là: ");
        int tmp = 0;
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(isnguyento(M[i][j]))
                {
                    System.out.print(M[i][j] + " ");
                    tmp++;
                }
            }
        }
        if(tmp == 0)
            System.out.println("Trong ma trận M không có số nguyên tố!");
        
        //4. Tính tổng các giá trị của ma trận
        int S = 0;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n;j++)
            {
                S = S + M[i][j];
            }
        }
        System.out.println("\nTổng các giá trị của ma trận là: " + S);
    }
}
