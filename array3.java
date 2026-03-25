public class array3 {
    public static void main(String[] args) {
        int[]n={10,20,30,40,50};
       
            int m=n[0];
            n[0]=n[n.length-1];
            n[n.length-1] = m;
            
        System.out.println("after"+n[0]);
        System.out.println("after"+n[n.length-1]);
    }
}
