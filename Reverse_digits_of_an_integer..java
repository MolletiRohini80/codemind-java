import java.util.Scanner;
public class uu{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=n;
        int r,s=0;
        while(q!=0){
            r=q%10;
            q=q/10;
            s=s*10+r;
        }
            System.out.printf("%d",s);
    }
}