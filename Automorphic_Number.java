import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=n*n;
        String a=Integer.toString(n);
        String b=Integer.toString(s);
        System.out.print(b.endsWith(a)?"Automorphic Number":"Not an Automorphic Number");
    }
}