import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("enter tool and arz");
        Scanner input1=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        int number1=input1.nextInt();
        int number2=input2.nextInt();
        if(number1==number2) {
            Res obj =new  Res(number1);
            System.out.println("masahat: "+obj.masahat+"\nmohit:  "+obj.mohit);
        }
        else {
            Res obj=new Res(number1, number2);
            System.out.println("masahat: "+obj.masahat+"\nmohit:  "+obj.mohit);
        }


    }
}
