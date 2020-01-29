
public class Hoghogh
{
    int hoghogh;
    int array[]=new int[100];
    int new_hoghogh;
    int end;
    public int setHoghogh() {
        int sum=0;
        for(int i =0;i<=end;i++)
            sum+=array[i];
        this.new_hoghogh=hoghogh-(sum);
        return this.new_hoghogh;
    }
}
