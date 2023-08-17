import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int r=a-2*b;
        if(a==0 && b%2==0){
            System.out.printf("YES");
        }
        else if(a==0 && b%2!=0){
            System.out.printf("NO");
        }
        else if(r%2==0){
            System.out.printf("YES");
        }
        else{
            System.out.printf("NO");
        }
    }
}