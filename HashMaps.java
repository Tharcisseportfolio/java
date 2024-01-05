import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

        HashMap<String,String> capitals = new HashMap<String,String>();

        capitals.put("Burundi","Bujumbura");
        capitals.put("Rwanda","Kigali");
        capitals.put("Tanzania","Dar-es-salaam");

        for(String i :capitals.keySet()){
            System.out.println(i);

               
        }  
        
    }
    
}
