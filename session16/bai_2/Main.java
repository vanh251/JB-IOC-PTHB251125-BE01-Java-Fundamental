package session16.bai_2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MessageManager messageManager = new MessageManager();
        while(true){
            System.out.println("""
                    --------------- MENU----------------
                    1. Gui tin nhan
                    2. Hien thi lich su tin nhan
                    3. Loc tin nhan theo nguoi gui
                    4. Loc tin nhan theo ngay gui
                    5. Thoat
                    -----------------------------------
                    nhap lua chon cua ban:
                    """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("nhap ten nguoi gui:");
                    String sender = sc.nextLine();
                    System.out.println("nhap noi dung tin nhan:");
                    String content = sc.nextLine();
                    messageManager.sendMessage(sender, content);
                    break;
                case 2:
                    messageManager.showHistory();
                    break;
                case 3:
                    System.out.println("nhap ten nguoi gui can loc:");
                    String filterSender = sc.nextLine();
                    messageManager.filterMessagesBySender(filterSender);
                    break;
                case 4:
                    try{
                        System.out.println("nhap ngay gui can loc (yyyy/MM/dd):");
                        LocalDate date = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("yyyy/MM/dd"));
                        messageManager.filterMessagesByDate(date);
                    }catch (DateTimeException e){
                        System.out.println("ngay nhap khong hop le, vui long nhap lai");
                    }
                    break;
                case 5:
                    System.out.println("thoat chuong trinh");
                    return;
                default:
                    System.out.println("lua chon khong hop le, vui long chon lai");
            }
        }
    }
}
