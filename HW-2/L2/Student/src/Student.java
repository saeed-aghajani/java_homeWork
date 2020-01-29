public class Student {
    String  fName;
    String  lName;
    int courceCount;
    double average;
    double sanavat;
    static int count;
    Student(String fName,String lName,int courceCount,double average,double sanavat){
        this.fName=fName;
        this.lName=lName;
         this.courceCount=courceCount;
        this.average=average;
         this.sanavat=sanavat;
         count++;
    }
    public Student(){
    }
    public void print(){

        System.out.println("\nfName: "+this.fName
        + "\nlName: "+this.lName
        + "\ncourceCount: "+this.courceCount
        + "\naverage: "+this.average
        + "\nsanavat: "+this.sanavat
        );
    }
    public String FullName(){
        String fullname=fName+" "+lName;
        return fullname;
    }

}
