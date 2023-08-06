import java.util.Scanner;
public class jui{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=(5*a+10*b);
        int e=d/c;
        System.out.printf("%d",e);
    }
}