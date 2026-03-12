
public class Palindrome {

    public static void main(String[] args) {
        int n = 121;
        int a = n;
        int m = 0;
        while (n != 0) {
            m = (m * 10) + (n % 10);

            n = n / 10;
        }

        if (a == m) {
            System.out.println(a + " it is palindrome");
        } else {
            System.out.println(a + " it is not palindrome");
        }
    }

}
