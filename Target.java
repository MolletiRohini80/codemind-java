import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int p1=sc.nextInt();
        int p2=sc.nextInt();
        int p3=sc.nextInt();
        int p4=sc.nextInt();
        if(p1>=10 && p2>=10 && p3>=10 && p4>=10){
            System.out.printf("YES");
        }
        else{
            System.out.printf("NO");
        }
    }
}