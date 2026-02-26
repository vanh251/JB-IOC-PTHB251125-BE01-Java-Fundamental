package vanh.bth;

public interface InterfaceMethod {
    void printf();

    default void printColor(){
        System.out.println("mau do");
    }

    static void printSize(){
        System.out.println("XXL");
    }
}
