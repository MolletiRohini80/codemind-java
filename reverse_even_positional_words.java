import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] a=s.split(" ");
        for(int i=0;i<a.length;i++){
            String r=a[i];
            if(i%2==0){
                for(int j=r.length()-1;j>=0;j--){
                    System.out.print(r.charAt(j));
                }
                System.out.printf(" ");
            }
            else{
                for(int k=0;k<r.length();k++){
                    System.out.print(r.charAt(k));
                }
                System.out.printf(" ");
            }
        }
    }
}