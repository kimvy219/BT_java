package baith1;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
public class bai06 {
    public static boolean namnhuan(int m)
    {
        if((m%4 == 0 && m%100 != 0) || (m%400 == 0))
            return true;
        else
            return false;
    }
    public static void main (String[] args)
    {   
        //Khai báo và nhập 2 ngày a và b từ bàn phím
        int x1,y1,z1,x2,y2,z2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập lần lượt ngày tháng năm của a:");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        z1 = sc.nextInt();
        System.out.print("Mời bạn nhập lần lượt ngày tháng năm của b:");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        z2 = sc.nextInt();
        Calendar a = Calendar.getInstance();
        Calendar b = Calendar.getInstance();
        a.set(z1,y1-1,x1);//Đặt tháng thêm -1 bởi vì hàm set lấy tháng bắt đầu từ giá trị 0
        b.set(z2,y2-1,x2);
        Date a1 = a.getTime();
        Date b1 = b.getTime();
        //System.out.println(a1);
        //System.out.println(b1);
        SimpleDateFormat sdf_ddMMyyyy = new SimpleDateFormat("dd/MM/yyyy");//Chuyển đổi format để hiển thị ra ngày/tháng/năm.
        System.out.println(sdf_ddMMyyyy.format(a1));
        System.out.println(sdf_ddMMyyyy.format(b1));
        
        //1. So sánh 2 ngày a và b
        //So sánh theo từng đơn vị
        if(z1 > z2)
        {
            System.out.println("Ngày a lớn hơn ngày b!");
        }
        else if(z1 < z2)
        {
            System.out.println("Ngày a nhỏ hơn ngày b!");
        }
        else
        {
            if(y1 > y2)
            {
                System.out.println("Ngày a lớn hơn ngày b!");
            }
            else if(y1 < y2)
            {
                System.out.println("Ngày a nhỏ hơn ngày b!");
            }
            else
            {
                if(x1 > x2)
                {
                    System.out.println("Ngày a lớn hơn ngày b!");
                }
                else if(x1 < x2)
                {
                    System.out.println("Ngày a nhỏ hơn ngày b!");
                }
                else
                    System.out.println("Ngày a và ngày b bằng nhau!");
            }
        
        }
        
        //2. In ra ngày trước và ngày tiếp theo của ngày a
        a.add(Calendar.DAY_OF_MONTH, -1);//Giảm a lại 1 ngày
        System.out.println("Ngày trước của a là: " + sdf_ddMMyyyy.format(a.getTime()));
        a.add(Calendar.DAY_OF_MONTH, 2);//Tăng a thêm 1 ngày
        System.out.println("Ngày sau của a là: " + sdf_ddMMyyyy.format(a.getTime()));
        a.add(Calendar.DAY_OF_MONTH, -1);//Trả lại ngày a lúc đầu nhập
        
        //3. Cho biết ngày a là ngày thứ mấy trong năm
        int d = a.get(Calendar.DAY_OF_YEAR);
        System.out.println("a là ngày thứ " + d + " trong năm!");
        
        //4. Cho biết tháng chứa a có bao nhiêu ngày
        int month = a.get(Calendar.MONTH)+1;//+1 cho tháng bởi vì hàm thư viện Calendar tính tháng bắt đầu từ 0
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng chứa a có 31 ngày!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng chứa a có 30 ngày!");
                break; 
            case 2:
            {
                if(namnhuan(a.get(Calendar.YEAR)))
                    System.out.println("Tháng chứa a có 29 ngày!");
                else
                    System.out.println("Tháng chứa a có 28 ngày!");
                break;
            }
        }
        
        //5. Cho biết năm chứa a có phải năm nhuần không
        if(namnhuan(a.get(Calendar.YEAR)))
            System.out.println("Năm chứa a là năm nhuần!");
        else
            System.out.println("Năm chứa a không phải là năm nhuần!");
    }
}
