package baith1;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class bai07 {
    public static void main(String[] args)
    {
        //Cho mảng số nguyên A với kích thước n
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Mời bạn nhập kích thước n của mảng A: ");
        n = sc.nextInt();
        
        int A[] = new int[n];//Khởi tạo mảng A với kích thước n
        //Nhập mảng A từ bàn phím
        for(int i=0; i<n; i++)
        {
            System.out.println("Mời bạn nhập phần tử thứ " + i + ":");
            A[i] = sc.nextInt();
        }
        
        //1. Tạo mảng số nguyên B với phần tử random
        int m;
        System.out.println("Mời bạn nhập kích thước m của mảng B: ");
        m = sc.nextInt();
        int B[] = new int[m];
        Random rd = new Random();//Khai báo phương thức Random
        //Tạo các phần tử Random cho mảng B
        for(int i=0; i<m; i++)
        {
            B[i] = rd.nextInt(1000);//Giới hạn khu vực Random từ 0 đến 999
        }
        
        //2. Xuất toàn bộ phần tử của B ra màn hình
        //Cách 1
        /*System.out.println("Các phần tử của B là: ");
        for(int i=0; i<m; i++)
        {
            System.out.print(B[i] + " ");
        }*/
        //Cách 2
        System.out.println("Các phần tử của B là:" + Arrays.toString(B));
        
        //3. Tạo mảng C từ mảng A
        int C[] = new int[n];
        //Cách 1
        /*for(int i=0; i<n; i++)
        {
            C[i] = A[i];
        }*/
        //Cách 2
        C = Arrays.copyOf(A,n);
        System.out.println("Các phần tử của C là :" + Arrays.toString(C));
        
        //4. Thay thế phần tử thứ 1 đến 3 của C bằng 3 phần tử cuối của B
        //Cách 1
        /*int tmp = m-3;
        for(int i=0; i<3; i++)
        {
            C[i] = B[tmp];
            tmp++;
        }*/
        //Cách 2
        System.arraycopy(B, m-3, C, 0 , 3);
        System.out.println("Các phần tử của C sau khi thay thế là :" + Arrays.toString(C));
        
        //5. Sắp xếp mảng C tăng dần và xuất ra màn hình
        //Cách 1
        /*int tmp;
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(C[j] < C[i])
                {
                    tmp = C[i];
                    C[i] = C[j];
                    C[j] = tmp;
                }
            }
        }*/
        //Cách 2
        Arrays.sort(C);
        System.out.println("Các phần tử của C sau khi sắp xếp là :" + Arrays.toString(C));
    }
}
