import java.util.Scanner;

public class EmpolyeeD {
    String name;
    int id,salary;
    EmpolyeeD(String name, int id,int salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int i=sc.nextInt();
        int s=sc.nextInt();
        EmpolyeeD details=new EmpolyeeD(n,i,s);
        details.display();
    }
}
