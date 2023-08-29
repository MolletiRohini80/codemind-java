import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int e=n-k;
        int f=e*y;
        int g=k*x;
        int j=e*x;
        if(x>y){
          if(n==k){
            System.out.printf("%d",x*k);
        }
        else{
            System.out.printf("%d",f+g);
        }
        }
        else{
            if(n==k){
                System.out.printf("%d",x*k);
            }
            else{
                System.out.printf("%d",j+g);
            }
        }
    }
}