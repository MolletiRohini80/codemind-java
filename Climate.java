import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>20){
            System.out.printf("HOT");
        }
        else{
            System.out.printf("COLD");
        }
    }
}