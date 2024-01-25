public class HelloWorld {
    public static void main(String[] args) {
        Integer integer1 = 200;
        Integer integer2 = 200;
        System.out.println(integer1 == integer2);
        System.out.println(integer1.intValue() == integer2.intValue());
    }
}
