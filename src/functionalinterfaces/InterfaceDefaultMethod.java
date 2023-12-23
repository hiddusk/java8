package functionalinterfaces;

public interface InterfaceDefaultMethod {
    default Integer add(Integer a, Integer b) {
        return a + b;
    }
}
