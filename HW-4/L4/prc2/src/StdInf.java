import java.util.ArrayList;
import java.util.List;
public class StdInf<Id ,UserName,Password> implements Cloneable {
    Id id;
    Password password;
    UserName userName;
    public  List listScores=new ArrayList() ;
     public StdInf(Id id, UserName userName, Password password){
         this.id=id;
         this.password=password;
         this.userName=userName;
     }
     public  void addScore(double score){
         listScores.add(score);
     }
     protected Object clone() throws CloneNotSupportedException{
          return super.clone();
     }

}
