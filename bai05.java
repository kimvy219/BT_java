package baith1;
import java.util.Scanner;
public class bai05 {
    public static void main(String[] args)
    {
        //Nhập 2 chuỗi s1 và s2 từ bàn phím
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập chuỗi 1:");
        s1 = sc.nextLine();
        System.out.print("Mời bạn nhập chuỗi 2:");
        s2 = sc.nextLine();
        
        //1. Cho biết tổng chiều dài 2 chuỗi s1 và s2
        int l1,l2;
        l1 = s1.length();//Phương thức tính độ dài của 1 chuỗi
        l2 = s2.length();
        int l = l1+l2;
        System.out.println("Tổng chiều dài của 2 chuỗi là: " + l);
        
        //2. Lấy 3 ký tự đầu tiên của chuỗi s1
        char[] character1 = s1.toCharArray();//Chuyển đổi chuỗi thành mảng và lưu tại mảng mới
        System.out.print("3 ký tự đầu của chuỗi s1 là: ");
        for(int i = 0; i < 3 ; i++ )
        {
            System.out.print(character1[i]);
        }
        
        //3. Lấy 3 ký tự cuối của chuỗi s2
        char[] character2 = s2.toCharArray();
        System.out.print("\n3 ký tự cuối của chuỗi s2 là: ");
        for(int i = s2.length()-3; i <= s2.length()-1 ; i++)
        {
            System.out.print(character2[i]);
        }
        
        //4. Lấy ký tự thứ 6 của chuỗi x
        //Chuỗi 1
        char ch1 = s1.charAt(5);//Lấy 1 ký tự của 1 chuỗi
        System.out.println("\nKý tự thứ 6 của chuỗi s1 là: " + ch1);
        //Chuỗi 2
        char ch2 = s2.charAt(5);
        System.out.println("Ký tự thứ 6 của chuỗi s2 là: " + ch2);
        
        //5. Kiểm tra 2 chuỗi s1 và s2 có bằng nhau không
        int result = s1.compareTo(s2);//So sánh 2 chuỗi có bằng nhau không
        if(result == 0 )
        {
            System.out.println("Hai chuỗi s1 và s2 bằng nhau");
        }
        else if(result < 0)
        {
            System.out.println("Chuỗi s1 bé hơn chuỗi s2!");
        }
        else
        {
            System.out.println("Chuỗi s1 lớn hơn chuỗi s2!");
        }
        
        //6. Cho biết s2 có xuất hiện trong s1 không? Nếu có là vị trí nào?
        int result1 = s1.indexOf(s2);//Kiểm tra thử chuỗi này có tồn tại trong chuỗi kia không
        if(result1 == -1)
        {
            System.out.println("Chuỗi s2 không có trong chuỗi s1!");
        }
        else
        {
            System.out.println("Chuỗi s2 xuất hiện trong s1 tại vị trí: " + result1);
        }
        
    }
}
