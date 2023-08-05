import java.util.Scanner;
public class cube{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int sa=6*s*s;
        int v=s*s*s;
        System.out.printf("Surface area = %d and Volume = %d",sa,v);
    }
}