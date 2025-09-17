import java.util.Scanner;

public class Item {
    String name;
    int code,price;
    Item(int code,String name,int price)
    {
        this.code=code;
        this.name=name;
        this.price=price;
    }
    int cost(int q,int p)
    {
        return q*p;
    }
    void display(int q)
    {
        int x=cost(q,price);
        System.out.println(x);
        System.out.println(q);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c= sc.nextInt();
        sc.nextLine();
        String s= sc.nextLine();
        int p= sc.nextInt();
        Item ob=new Item(c,s,p);
        System.out.println("enter quantity");
        int q= sc.nextInt();
        ob.cost(q,p);
        ob.display(q);
    }
}
