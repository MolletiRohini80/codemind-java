import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%9==0){
            System.out.printf("True");
        }
        else{
            System.out.printf("False");
        }
    }
}