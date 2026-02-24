package session15.bai_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Subject {
    private String code;
    private String name;
    private int credits;
    private LocalDate startDate;

    public Subject() {}

    public Subject(String code, String name, int credits, LocalDate startDate) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.startDate = startDate;
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }
    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("Ma: %-10s | Ten: %-20s | Tin chi: %d | Bat dau: %s",
                code, name, credits, startDate.format(dtf));
    }
}