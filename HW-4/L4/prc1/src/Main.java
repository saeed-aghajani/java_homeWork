import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         List<StudentsInformation> list = new ArrayList<>();
        System.out.println("enter your information\n");
        Scanner input=new Scanner(System.in);
        System.out.println("'name'    'field'    'orientation'    'id'    'age' ");
        StudentsInformation student1=new StudentsInformation(input.nextLine(),input.nextLine(),input.nextLine(),input.nextInt(),input.nextInt());
        list.add(student1);
        for (StudentsInformation std :list)
        {
            System.out.println("name:" + std.name
            + "\nage: " + std.age
            + "\nid: " + std.id
            + "\nfield: " + std.field
            + "\norientation: " + std.orientation
            );
        }

    }
}
