import java.util.Scanner;
public class capacity{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int cap;
        int t=sc.nextInt();
        int s=sc.nextInt();
        int b=sc.nextInt();
        cap=2*t*s*b*512;
        int T=cap/1024;
        System.out.printf("%d KB",T);
    }
    
}