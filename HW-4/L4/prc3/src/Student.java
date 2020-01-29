import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    List<Double> listScore = new ArrayList();
     public Student(String name){
         this.name=name;
     }
     public double calculateAverage()
     {
         double sum=0 , avg;
         int count=0;

         for (Double score : listScore)
         {
             count +=1;
             sum +=score;
         }
         avg=sum/count;
         return avg;
     }
     public void resuut(double avg)
     {
         if (avg<10)
             System.out.println("You failed...");
         else
             System.out.println("You passed...");
     }


}
