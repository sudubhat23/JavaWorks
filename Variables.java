public class Variables {
    public static void main(String[] args) {
       
        double num = 85.5; // Example score
        if(num>=90 && num<=100){
            System.out.println("Grade: A");
        } else if(num>=70 && num<90){
            System.out.println("Grade: B");
        } else if(num>=50 && num<70){
            System.out.println("Grade: C");
        } else if(num>=35 && num<50){
            System.out.println("Grade: D");
        } else if(num>=0 && num<35){
            System.out.println("Fail");
        }
    }
}
