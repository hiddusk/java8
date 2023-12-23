package functionalinterfaces;

public class InterfaceDefaultMethodImpl implements InterfaceDefaultMethod {
    @Override
    public Integer add(Integer a, Integer b) {
        return a*b;
    }

    public static void main(String[] args) {
        InterfaceDefaultMethod interfaceDefaultMethod = new InterfaceDefaultMethodImpl();
        System.out.println(interfaceDefaultMethod.add(5, 10));
    }
}
