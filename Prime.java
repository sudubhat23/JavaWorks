
public class Prime {

    public static void main(String[] args) {
        int a = 4;
        int count = 0;
        for (int i = 2; i <= (a - 1); i++) {

            if (a % i == 0) {
                count++;

            }
            }
            if (count >= 1) {
                System.out.println("it is prime");
            } else {
                System.out.println("not a prime");

            }
        
    }
}
