package session16.bai_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class MessageManager {
    private Collection<Message> messagelist;

    public MessageManager() {
        messagelist = new ArrayList<>();
    }

    public void sendMessage(String sender, String content){
        Message message = new Message(sender, content, LocalDateTime.now());
        messagelist.add(message);
        System.out.println("da gui tin nhan thanh cong");
    }

    public void showHistory(){
        System.out.println("Lich su tin nhan: ");
        messagelist.forEach(System.out::println);
    }

    public void filterMessagesBySender(String sender){
        System.out.println("cac tin nhan cua " + sender + ":");
        messagelist.stream().filter(x-> x.getSender().equalsIgnoreCase(sender))
                .forEach(x-> System.out.println(x.getContent() + " - " + x.getTimestamp()));
    }

    public void filterMessagesByDate(LocalDate date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("cac tin nhan gui vao ngay " + date.format(formatter) + ":");
        messagelist.stream().filter(x-> x.getTimestamp().toLocalDate().equals(date))
                .forEach(x-> System.out.println(x.getContent() + " - " + x.getSender()));
    }
}
