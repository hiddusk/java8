package functionalinterfaces;

import java.util.function.BiConsumer;

public class BiConsumerFunctionalInterface {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("Welcome To " + a+b);
        biConsumer.accept("Functional Interfaces", " And Lambdas");
    }

}
