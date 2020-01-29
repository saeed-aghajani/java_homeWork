package model;

import java.util.List;

public class Service {
    private  static Service service = new Service();
    public  void buy(String name){
        Repository repository = new Repository();
        repository.delete(name);
    }
    public   static  Service getInstance(){
        return service;
    }
    public List<Entity> show() {
        List<Entity> entityList = null;
        Repository repository = new Repository ();
        try {
            entityList=repository.select ();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entityList;
    }


}
