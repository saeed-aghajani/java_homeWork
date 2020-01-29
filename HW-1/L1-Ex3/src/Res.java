/**
 *
 */
public class Res
{
    int mohit;
    int masahat;
    Res(int number1)
    {
        System.out.println("square");
        this.mohit=(number1)*4;
        this.masahat=(number1*number1);
    }
    Res(int number1, int number2)
    {
        System.out.println("rectangle");
        this.mohit=(number1+number2)*2;
        this.masahat=(number1*number2);
    }
}
