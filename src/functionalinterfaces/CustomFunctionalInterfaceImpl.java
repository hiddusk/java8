package functionalinterfaces;

public class CustomFunctionalInterfaceImpl {
    public static void main(String[] args) {
        CustomFunctionalInterface customFunctionalInterface = (a, b) -> {return a+b;};
        System.out.println(customFunctionalInterface.add(5, 10));
    }
}
