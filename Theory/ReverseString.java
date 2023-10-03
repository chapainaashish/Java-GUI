package Theory;

public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello, World!";
        StringBuilder reversed = new StringBuilder(original).reverse();
        String result = reversed.toString();
        System.out.println(result);
    }
}