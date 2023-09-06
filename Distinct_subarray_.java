import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int s,c=0;
        for(int i=l;i<=r;i++){
            s=0;
            for(int j=i;j<=r;j++){
            s+=j;
            if(s%2!=0){
                c+=1;
            }
        }
        }
        System.out.printf("%d",c);
    }
}