import java.util.Scanner;
public class trap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double d=((a+b)*c)/2.0;
        System.out.printf("%.4f",d);
    }
}