package session15.bai_2;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SubjectManager<Subject> manager = new SubjectManager<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- QUAN LY MON HOC ---");
            System.out.println("1. Hien thi | 2. Them | 3. Xoa | 4. Tim kiem | 5. Loc (>3TC) | 0. Thoat");
            System.out.print("Chon chuc nang: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1: manager.displayAllSubject(); break;
                    case 2:
                        System.out.print("Ma mon: "); String code = sc.nextLine();
                        System.out.print("Ten mon: "); String name = sc.nextLine();
                        System.out.print("Tin chi (0-10): ");
                        int credits = Integer.parseInt(sc.nextLine());
                        if (credits < 0 || credits > 10) {
                            throw new Exception("Loi: So tin chi phai tu 0 den 10!");
                        }
                        System.out.print("Ngay (yyyy-MM-dd): ");
                        LocalDate date = LocalDate.parse(sc.nextLine());
                        manager.addSubject(new Subject(code, name, credits, date));
                        break;
                    case 3:
                        System.out.print("Ma can xoa: ");
                        manager.deleteSubject(sc.nextLine());
                        break;
                    case 4:
                        System.out.print("Ten can tim: ");
                        manager.searchSubjectByName(sc.nextLine());
                        break;
                    case 5:
                        manager.filterSubjectByCredits(3);
                        break;
                    case 0: return;
                    default: System.out.println("Chon tu 0-5.");
                }
            } catch (NumberFormatException e) {
                System.err.println("Loi: Phai nhap so!");
            } catch (DateTimeParseException e) {
                System.err.println("Loi: Sai dinh dang ngay (yyyy-MM-dd)!");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}