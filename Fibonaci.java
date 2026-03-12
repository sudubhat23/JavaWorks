
public class Fibonaci {

    public static void main(String[] args) {
        double a = 0;
        double b = 1;
        double temp ;
        for (int i = 0; i < 100; i++) {
            temp = a + b;
            a = b;
            b = temp;

            System.out.println(temp);
        }

    }
}
