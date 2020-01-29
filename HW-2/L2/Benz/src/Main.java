import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter name car");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        if(name.compareTo("benz")==0){
            Benz class1=new A();
            Benz class2=new B();
            Benz class3=new C();
            Benz class4=new Amg1();
            Benz class5=new Amg2();
            class1.print();
            class2.print();
            class3.print();
            class4.print();
            class5.print();
        }
    }
}
