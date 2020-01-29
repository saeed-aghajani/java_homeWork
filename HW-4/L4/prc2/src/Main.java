import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter (id)    (username)   (password)");
        StdInf std=new StdInf(input.nextInt(),input.next(),input.next());
        System.out.println("enter 5 scores...");

        for(int i=0;i<5;i++){
            std.addScore(input.nextDouble());
        }
        StdInf clone1=null;
        StdInf clone2=null;
        StdInf clone3=null;
        StdInf clone4=null;
        StdInf clone5=null;
        try {
            clone1 = (StdInf)  std.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        try {
            clone2 = (StdInf)  std.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        try {
            clone3 = (StdInf)  std.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        try {
            clone4 = (StdInf)  std.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        try {
            clone5 = (StdInf)  std.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
