
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i=0;
        Hoghogh obj=new Hoghogh();
        System.out.println("enter hoghiogh:");
        Scanner input=new Scanner(System.in);
        int c_hoghogh=input.nextInt();
        obj.hoghogh=c_hoghogh;
        System.out.println("enter aghsat if finished enter 0");
        for( i=0;i<100;i++)
        {
            input = new Scanner(System.in);
            int ghest=input.nextInt();
            if (ghest==0)
                break;
            obj.array[i]=ghest;
        }
        obj.end=i;

        obj.setHoghogh();
        System.out.println(obj.new_hoghogh);


    }
}
