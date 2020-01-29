package controller;

import model.Entity;
import model.Service;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("\t\tSIAPA\t\t\n");
        try {
            List<Entity> list = Service.getInstance().show();
            int i=0;
            for (Entity entity : list) {
                System.out.println(i);
                System.out.println(entity.getName());
                System.out.println(entity.getPrice());
                System.out.println(entity.getColor());
                System.out.println(entity.getWeight());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}