public class DataType {
    public static void main(String[] args) {
              // Byte (whole number from -128 to 127)
       short myShort = 10000;       // Short (whole number from -32,768 to 32,767)

        int myNum = 5;               // Integer (whole number)
        long myLongNum = 15000000000L; // Long (whole number, larger than int)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        System.out.println("Integer: " + myNum);
        System.out.println("Float: " + myFloatNum);
        System.out.println("Character: " + myLetter);
        System.out.println("Boolean: " + myBool);
        System.out.println("String: " + myText);
        System.out.println("Short: " + myShort);
        System.out.println("Long: " + myLongNum);
    }
    
}
