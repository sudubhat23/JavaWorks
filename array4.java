public class array4 {
    public static void main(String[] args) {
        int []n={1,6,9,4,2,8,7,3,5};
        int count=0;
        for (int i = 0; i <n.length; i++) {
            if(n[i]%2==0){
                count++;
                System.out.println("even "+n[i]);
            }
           
        } System.out.println(count);
    }
}
// git add README.md
// git commit -m "first commit"
// git branch -M main
// git remote add origin https://github.com/sudubhat23/React_works.git
// git push -u origin main