import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a;
        for(int i=1;i<=n;i++){
            a=sc.next();
            int x=Integer.parseInt(a,8);
            System.out.printf(Integer.toString(x,2));
            System.out.printf("
");
        }
    }
}