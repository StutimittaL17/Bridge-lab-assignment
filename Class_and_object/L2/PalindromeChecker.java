import java.util.Scanner;

public class PalindromeChecker {
    String text;
    PalindromeChecker(String text)
    {
        this.text=text;
    }
    int ispalin(String s)
    {
        int flag=0;
        String w="";
        for (int i = s.length()-1; i >=0; i--) {
            w=w+s.charAt(i);
        }
        if(s.equals(w))
        {
            flag=1;
        }
        return flag;
    }
    void display(String s)
    {
        int x=ispalin(s);
        if (x==1)
        {
            System.out.println("palin");
        }
        else
        {
            System.out.println("not");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        PalindromeChecker ob=new PalindromeChecker(s);
        ob.display(s);
    }
}
