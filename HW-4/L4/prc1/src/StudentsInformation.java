public class StudentsInformation< Kind > {
    Kind property;
    String name;
    int age;
    int id;
    String field;
    String orientation;
    public StudentsInformation(String name,String field,String orientation,int id,int age){
        this.age = age;
        this.field = field;
        this.id = id;
        this.orientation = orientation;
        this.name = name;
    }




}
