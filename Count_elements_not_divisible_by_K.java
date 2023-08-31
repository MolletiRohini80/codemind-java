import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int s[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
        }
        for(int i:s){
            if(i%a!=0){
                c+=1;
            }
        }
        System.out.printf("%d",c);
    }
}