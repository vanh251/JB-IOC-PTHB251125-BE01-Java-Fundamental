package session14.bai_4;

import java.util.*;

public class main {
    public static void validatePhoneNumber(String phone) throws InvalidPhoneNumberLengthException{
        phone = phone.trim();
        if (!phone.matches("^\\d+$")) {
            throw new InvalidPhoneNumberLengthException("Chứa ký tự không hợp lệ (chữ cái, khoảng trắng hoặc ký tự đặc biệt)");
        }

        if(phone.length()!=10){
            throw new InvalidPhoneNumberLengthException("Độ dài số điện thoại không hợp lệ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] listPhone = s.split(",");
        List<String> validPhoneNumbers = new ArrayList<>();
        HashMap<String, String> invalidPhoneNumbers = new HashMap<String, String>();
        for(String phone: listPhone){
            try{
                validatePhoneNumber(phone);
                validPhoneNumbers.add(phone.trim());
            } catch (InvalidPhoneNumberLengthException e){
                invalidPhoneNumbers.put(phone.trim(), e.getMessage());
            }
        }

        System.out.println("Số điện thoại hợp lệ:");
        for(String phone: validPhoneNumbers){
            System.out.printf("-%s\n", phone);
        }
        System.out.println("Số điện thoại không hợp lệ:");
        for(Map.Entry<String, String> entry : invalidPhoneNumbers.entrySet()){
            System.out.printf("-%s: %s\n", entry.getKey(), entry.getValue());
        }
    }
}
