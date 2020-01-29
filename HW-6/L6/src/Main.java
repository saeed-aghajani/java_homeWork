import java.util.Scanner;

public class Main
{
    public static int getNum(){
        Scanner scanner=new Scanner(System.in);
        int num =  Integer.parseInt(scanner.next());
        return num;
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        Student student=new Student();
        Database database = new Database();
        boolean b =  false;
        while(true){
            System.out.println("Enter number for menu:1_insert 2_update 3_remove 4_Close");
            int in = getNum();
            switch(in){
                case 1:
                    System.out.println("Enter thr stdnum:");
                    int id = getNum();
                    student.setId(id);
                    System.out.println("Enter thr name:");
                    student.setName(scanner.next());
                    System.out.println("Enter thr average:");
                    student.setAverage(scanner.next());
                    System.out.println("Enter thr year:");
                    student.setYear(scanner.nextInt());
                    database.insert(student.getId(), student.getName(), student.getYear(), student.getAverage());
                    break;
                case 2:
                     System.out.println("Enter yor choise for edit:1_updateID 2_updateName 3_updateYear 4_updateAverage");
                     int num=scanner.nextInt();
                    switch (num)
                    {
                        case 1:
                            System.out.println("Enter thr Update stdnum:");
                            int Uid = getNum();
                            student.setId(Uid);
                            database.updateId(student.getId());
                            break;
                        case 2:
                            System.out.println("Enter the uppdateName stdName");
                            student.setName(scanner.next());
                            database.updateName(student.getName());
                            break;
                        case 3:
                            System.out.println("Enter the updateYear ");
                            student.setYear(scanner.nextInt());
                            database.updateYear(student.getYear());
                            break;
                        case 4:
                            System.out.println("Enter the updatAverage ");
                            student.setAverage(scanner.next());
                            database.updateAvrage(student.getAverage());
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Enter your stdId for remove");
                    student.setId(scanner.nextInt());
                    System.out.println("Enter your stdName for remove");
                    student.setName(scanner.next());
                    database.Remove(student.getId(),student.getName());
                    break;
                case 4:
                    b=true;
                    break;
            }
            if(b)
                break;
        }
    }
}
