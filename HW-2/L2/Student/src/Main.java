import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("  enter your full name  ");
        Scanner input=new Scanner(System.in);
        String fullname=input.nextLine();
        Student[] student = new Student[500];
        Student counter=new Student();
        student[0] = new Std1();
        student[1] = new Std2();
        student[2] = new Std3();
        for(int i = 0;i<3;i++)
        {
            if(fullname.equals(student[i].FullName())){
                student[i].print();
            }
        }




    }
}

