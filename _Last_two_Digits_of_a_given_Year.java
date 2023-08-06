import java.util.Scanner;
public class year{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int y=sc.nextInt();
        int d=y%100;
        System.out.printf("%02d",d);
    }
}