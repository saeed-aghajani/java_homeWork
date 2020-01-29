public class Lesson {
    String name;
    String prerequisites;
    String theNeed;
    int countCourse;
   Lesson(String name , String prerequisites , String theNeed , int countCourse){
       this.name=name;
       this.prerequisites=prerequisites;
       this.theNeed=theNeed;
       this.countCourse=countCourse;
   }
   public void print(){
       System.out.println("name: " + name
               + "\nprerequisites: " + prerequisites
               + "\ntheNeed: " + theNeed
               + "\ncountCourse: " + countCourse
       );
   }
}
