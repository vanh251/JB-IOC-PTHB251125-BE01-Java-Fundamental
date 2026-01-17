package vanh;
import java.util.Scanner;

public class StringSession05 {
    public static void main(String[] args) {
        String[] listNames = {
                "Nguyen Van A",
                "Le Thi B",
                "Tran Van C",
                "Pham Thi D",
                "Hoang Van E",
                "Vu Thi F",
                "Dang Van G",
                "Bui Thi H",
                "Do Van I",
                "Ngo Thi K"
        };
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("""
                    +--------------------MENU---------------------+
                    1. Hiển thị danh sách tên sinh viên
                    2. Tìm kiếm sinh viên theo tên
                    3. Sắp xếp sinh viên theo tên (A-Z || Z-A)
                    4. Thoát
                    +--------------------MENU---------------------+
                    """);
            System.out.println("Vui lòng chọn chức năng: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    System.out.println("Hiển thị danh sách tên sinh viên");
                    if (listNames.length == 0){
                        System.out.println("Danh sách sinh viên rỗng!");
                    } else {
                        printListName(listNames, listNames.length);
                    }
                    break;
                case 2:
                    System.out.println("Tìm kiếm sinh viên theo tên");
                    System.out.println("Nhập tên sinh viên cần tìm kiếm: ");
                    String searchName = sc.nextLine();
                    String[] searchNames = new String[listNames.length];
                    int n = 0;
                    for (String name: listNames){
                        if(name.toLowerCase().contains(searchName.toLowerCase())){
                            searchNames[n] = name;
                            n++;
                        }
                    }
                    if(n == 0){
                        System.out.println("Không tìm thấy sinh viên nào có tên là: " + searchName);
                    } else {
                        printListName(searchNames, n);
                    }
                    break;
                case 3:
                    System.out.println("Sắp xếp sinh viên theo tên (A-Z || Z-A)");
                    for (int i=0; i< listNames.length -1 ; i++){
                        for (int j = 0; j < listNames.length -i-1 ; j++) {
                            if(listNames[j].compareTo(listNames[j+1])>0){
                                String temp = listNames[j];
                                listNames[j] = listNames[j+1];
                                listNames[j+1] = temp;
                            }
                        }
                    }
                    System.out.println("Danh sách sinh viên sau khi sắp xếp A-Z: ");
                    printListName(listNames, listNames.length);
                    break;
                case 4:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                default:
                    System.out.println("Chức năng không hợp lệ, vui lòng chọn lại!");
            }
        }
    }
    public static void printListName(String[] listNames, int n){
        System.out.printf("+%s+%s+\n", "-".repeat(5), "-".repeat(30));
        System.out.printf("| %-3s | %-28s |\n", "STT","Họ và tên");
        System.out.printf("+%s+%s+\n", "-".repeat(5), "-".repeat(30));
        for (int i = 0; i < n ; i++) {
            System.out.printf("| %-3s | %-28s |\n", i+1, listNames[i]);
        }
        System.out.printf("+%s+%s+\n", "-".repeat(5), "-".repeat(30));
    }

    public static void printList(String[] sv, int n){
        System.out.printf("+%s+%s+\n", "-".repeat(5), "-".repeat(30));
        System.out.printf("| %-3f ");
    }
}