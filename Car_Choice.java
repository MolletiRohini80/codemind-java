import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int y1=sc.nextInt();
            int y2=sc.nextInt();
            double a=(float)y1/x1;
            double b=(float)y2/x2;
            if(a<b){
                System.out.printf("-1");
                System.out.printf("
");
            }
            else if(a==b){
                System.out.printf("0");
                System.out.printf("
");
            }
            else{
                System.out.printf("1");
                System.out.printf("
");
            }
        }
    }
}