import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a+b<c || b+c<a || a+c<b){
                System.out.printf("YES
");
            }
            else{
                System.out.printf("NO
");
            }
        }
    }
}