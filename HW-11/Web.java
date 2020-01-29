package com.Company;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/save")
public class SimRest {
    @Path("/university")
    @GET
    @Produces("text/plain")
    public String sum ()
    {
        System.out.println("save executed in server");

        // 1___________:
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("name","sharif");
        jsonObject1.put("location","jonob");
        
        // 2__________________:
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("location","jonob");
        jsonObject2.put("name","tehran");

        // 3__________:
        JSONObject jsonObject3 = new JSONObject();
        jsonObject3.put("name","amirkabir");
        jsonObject3.put("location","jonob");

        
        // 4_________:
        JSONObject jsonObject4 = new JSONObject();
        jsonObject4.put("name","elmosanat");
        jsonObject4.put("location","sharq");
        
        // 5________:
        JSONObject jsonObject5 = new JSONObject();
        jsonObject5.put("name","elmofarhang");
        jsonObject5.put("location","gharb");
        
        // 6_________:
                
        JSONObject jsonObject6 = new JSONObject();
        jsonObject6.put("name","olom tahqiqat");
        jsonObject6.put("location","shomal");


        // 7_______:
                JSONObject jsonObject7 = new JSONObject();
        jsonObject7.put("name","tehran markaz");
        jsonObject7.put("location","markaz");


        // 8____________:
        JSONObject jsonObject8 = new JSONObject();
        jsonObject8.put("name","tehran gharb");
        jsonObject8.put("location","gharb");



        // array ______________________________________________________________-
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(jsonObject1);

        jsonArray.add(jsonObject2);

        jsonArray.add(jsonObject3);

        jsonArray.add(jsonObject4);
    
        jsonArray.add(jsonObject5);

        jsonArray.add(jsonObject6);

        jsonArray.add(jsonObject7);

        jsonArray.add(jsonObject8);

        return jsonArray.toJSONString();
    }
}