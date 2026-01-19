package session06;

import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "", email = "", phone = "", passWords = "";
        while (true){
            System.out.println("""
                    ***************** quan ly nguoi dung *****************
                    1.  nhap thong tin nguoi dung
                    2.  chuan hoa ho ten
                    3.  kiem tra email hop le
                    4.  kiem tra so dien thoai hop le
                    5.  kiem tra mat khau hop le
                    6.  thoat
                    lua chon cua ban:
                    """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("nhap ten, email, sdt, mat khau");
                    name= sc.nextLine();
                    email = sc.nextLine();
                    phone =sc.nextLine();
                    passWords=sc.nextLine();
                    break;
                case 2:
                    name = chuanHoa(name);
                    System.out.println("ten da chuan hoa "+name);
                    break;
                case 3:
                    if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"))
                        System.out.println("Email hợp lệ!");
                    else System.out.println("Email không hợp lệ!");
                    break;
                case 4:
                    if (phone.matches("^0[35789]\\d{8}$"))
                        System.out.println("Số điện thoại hợp lệ!");
                    else System.out.println("Số điện thoại không hợp lệ!");
                    break;
                case 5:
                    if (passWords.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!^&*]).{8,}$"))
                        System.out.println("Mật khẩu hợp lệ!");
                    else System.out.println("Mật khẩu không hợp lệ!");
                    break;
                case 6:
                    return;
                default:
                    System.out.println("nhap lua chon tu 1-6");
                    break;
            }
        }
    }

    public static String chuanHoa(String str){
        str = str.trim().toLowerCase().replaceAll("\\s+", " ");
        String [] s = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : s){
            sb.append(Character.toUpperCase(word.charAt(0)));
            sb.append(word.substring(1));
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}

//Thông tin người dùng gồm: Họ và tên, email, điện thoại và mật khẩu
//Số điện thoại có định dạng số điện thoại di động tại Việt Nam
//Email có định dạng email theo quy định
//Mật khẩu có tối thiểu 8 ký tự, gồm ký tự anphabet viết thường, viết hoa, ký tự số và ký tự đặc biệt