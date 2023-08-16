import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a/b;
            if(a%b==0){
                System.out.printf("%d
",c);
            }
            else{
                int d=a%b;
                int e=c+d;
                System.out.printf("%d
",e);
            }
        }
    }
}