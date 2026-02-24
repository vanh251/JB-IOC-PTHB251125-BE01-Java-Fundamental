package session15.bai_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SubjectManager <T extends Subject> {
    private ArrayList<T> subjectList = new ArrayList<>();

    public void addSubject(T subject) {
        subjectList.add(subject);
        System.out.println("Da them mon hoc thanh cong.");
    }

    public void displayAllSubject() {
        if (subjectList.isEmpty()) {
            System.out.println("Danh sach mon hoc dang trong.");
        } else {
            subjectList.forEach(System.out::println);
        }
    }

    public Optional<T> findByCode(String code) {
        return subjectList.stream()
                .filter(s -> s.getCode().equalsIgnoreCase(code))
                .findFirst();
    }

    public void deleteSubject(String code) {
        Optional<T> subject = findByCode(code);
        if (subject.isPresent()) {
            subjectList.remove(subject.get());
            System.out.println("Da xoa mon hoc thanh cong.");
        } else {
            System.out.println("Khong tim thay ma mon hoc: " + code);
        }
    }

    public void searchSubjectByName(String name) {
        List<T> result = subjectList.stream()
                .filter(s -> s.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            System.out.println("Khong co mon hoc phu hop.");
        } else {
            result.forEach(System.out::println);
        }
    }

    public void filterSubjectByCredits(int minCredits) {
        System.out.println("Cac mon hoc co tin chi > " + minCredits + ":");
        List<T> filtered = subjectList.stream()
                .filter(s -> s.getCredits() > minCredits)
                .collect(Collectors.toList());

        if (filtered.isEmpty()) System.out.println("Khong co mon nao thoa man.");
        else filtered.forEach(System.out::println);
    }
}