import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=a+b;
        int e=b+c;
        int f=c+a;
        if(d>e && d>f){
            System.out.printf("%d",d);
        }
        else if(e>d && e>f){
            System.out.printf("%d",e);
        }
        else{
            System.out.printf("%d",f);
        }
    }
}