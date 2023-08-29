import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<=b){
            for(int i=a;i<=b;i++){
                System.out.printf("%d ",i);
            }
        }
    }
}