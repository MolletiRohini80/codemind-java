import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=n%3;
        if(n==0){
            System.out.printf("NORMAL");
        }
        else if(n==1){
            System.out.printf("HUGE");
        }
        else{
            System.out.printf("SMALL");
        }
    }
}