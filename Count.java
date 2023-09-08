import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int c=0;
        int s=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                c+=1;
            }
            else{
                s+=1;
            }
        }
        System.out.printf("%d ",s);
        System.out.printf("%d",c);
    }
}