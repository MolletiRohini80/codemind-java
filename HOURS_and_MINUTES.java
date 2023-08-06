import java.util.Scanner;
public class min{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int h=s/60;
        int m=s%60;
        System.out.printf("%d Hour(s) %d Minute(s)",h,m);
    }
}