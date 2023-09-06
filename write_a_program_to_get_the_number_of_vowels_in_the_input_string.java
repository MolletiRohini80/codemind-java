import java.util.Scanner;
public class tt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a="aeiouAEIUO";
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(a.contains(""+ch)){
                c+=1;
            }
        }
        System.out.printf("%d",c);
    }
}