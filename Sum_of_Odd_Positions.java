import java.util.Scanner;
public class s{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int s=0,r=0;
        for(int i=0;i<n;i++)
        {
            if(i%2!=0)
            {
                s+=a[i];
            }
        }
        System.out.printf("%d",s);
    }
}