import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int c=0;
        for(int i=0;i<str.length();i++){
            int ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'){
                c+=1;
            }
        }
        System.out.printf("%d",c);
    }
}