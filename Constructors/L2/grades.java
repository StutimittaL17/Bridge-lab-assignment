import java.util.Scanner;

class grades {
    String name;
    int rollNumber;
    double marks;

    grades(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else if (marks >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

    void displaydetails() {
        System.out.println("Student Details:");
        System.out.println("Name " + name);
        System.out.println("Roll Number " + rollNumber);
        System.out.println("Marks " + marks);
        System.out.println("Grade " + calculateGrade());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n= sc.nextLine();
        int r= sc.nextInt();
        int m= sc.nextInt();
        grades ob = new grades(n, r, m);
        ob.displaydetails();
    }
}
