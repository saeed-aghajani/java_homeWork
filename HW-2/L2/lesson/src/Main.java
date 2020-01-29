import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lesson[] lesson = new Lesson[500];
        lesson[0] = new Lesson("math1","_","physics2",3);
        lesson[1] = new Lesson("math2","math1","physics2",3);
        lesson[2] = new Lesson("physics2","math1 & physics1",",math2",3);
        lesson[3] = new Lesson("enghelab","_",",_",2);
        System.out.println("enter name lesson ");
        Scanner input=new Scanner(System.in);
        String lsn=input.nextLine();
        for(int i=0;i<5;i++){

            if(lsn.compareTo(lesson[i].name)==0)
                 lesson[i].print();
        }
    }
}
