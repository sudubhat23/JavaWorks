public class Casecheck 
{
    public static void main(String[] args) {
        char ch= 'a';
    
    if(ch>='A'&&ch<='Z'){
        System.out.println("it is upper");
    }
    else if(ch>='a'&&ch<='z')
    {
        System.out.println("it is lower");
    }
     else if(ch>='0'&&ch<='9'){
        System.out.println("it is number");
     }
     else{
         System.out.println("it is special character");
     }
    }
}
    

