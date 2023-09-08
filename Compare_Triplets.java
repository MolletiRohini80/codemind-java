import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[3];
        int[] b=new int[3];
        int c=0;
        int s=0;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
        if(a[i]>b[i]){
            c+=1;
        }
        else if(a[i]<b[i]){
            s+=1;
        }
        }
        System.out.printf("%d ",c);
        System.out.printf("%d",s);
    }
}