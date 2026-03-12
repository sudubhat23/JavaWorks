
public class factors {

    public static void main(String[] args) {
        int a = 10;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {

                System.out.println(i + " it is factor");
            } else {
                System.out.println(i + " it is  not factor");
            }

        }

    }
}
