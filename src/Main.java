public class Main {

    public static int changeValue(Integer value) {
    value = 22;
        return value;
    }

    public static void main(String[] args) {
    Integer value = 33;
        changeValue(value);
        System.out.println(value);
    }
}