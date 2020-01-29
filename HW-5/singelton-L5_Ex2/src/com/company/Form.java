package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Form {
    private static Form form =new Form();
    public static Form getInstance(){
        return form;
    }
    private Form(){}
     public void CreatForm(){

         System.out.println("craeting form");
     }
     public void job(){
         System.out.println("recomending job");
     }
}
