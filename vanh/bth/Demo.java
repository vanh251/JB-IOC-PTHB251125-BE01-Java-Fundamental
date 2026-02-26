package vanh.bth;

public class Demo implements InterfaceMethod{

    @Override
    public void printf() {
        System.out.println("hello");
    }

    @Override
    public void printColor() {
        System.out.println("mau xanh");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.printf();
    }
}
