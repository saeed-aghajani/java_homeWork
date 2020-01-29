import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
     public  static List<Student> listStudent = new ArrayList();
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Student std1 = new Student("leila parvar");
        Student std2 = new Student("sara lotfi");
        Student std3 = new Student("reza khodeyari");
        Student std4 = new Student("sajad azad");
        listStudent.add(std1);
        listStudent.add(std2);
        listStudent.add(std3);
        listStudent.add(std4);
        System.out.println("enter student's name...");
        String name = input.nextLine();
        try {
            search( name);
        } catch (StdExp stdExp) {
            stdExp.printStackTrace();
        }

    }
    public  static void search(String name) throws StdExp{
        Scanner input = new Scanner(System.in);
         int count=0;
        for (Student std : listStudent){
            if((std.name).equals(name)){
                count +=1;
                System.out.println("enter 5 scores...");
                for (int i=0;i<5;i++)
                {
                    std.listScore.add(input.nextDouble());
                }
                System.out.println("Your average: "+ std.calculateAverage());
                std.resuut(std.calculateAverage());
            }
        }
        if(count==0)
        {
            throw  new StdExp("The student doesnt exist...");

        }
    }
}
