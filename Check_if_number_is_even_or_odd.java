import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x%2==0){
            System.out.printf("Even");
        }
        else{
            System.out.printf("Odd");
        }
    }
}