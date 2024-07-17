import java.util.HashMap;
import java.util.Map;
public class Hashmap {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
           HashMap<Integer,String> hm=new HashMap<Integer,String>();    
      hm.put(100,"Amit");    
      hm.put(101,"Vijay");    
      hm.put(102,"Rahul"); 
      hm.put(101,"tejas");//trying to add duplicate key

      System.out.println("Initial list of elements:");  
     for(Map.Entry m:hm.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     }  
     System.out.println("Updated list of elements:"+hm);  
     hm.replace(102, "Gaurav");  //replace the value of 102 key 
     for(Map.Entry m:hm.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     }  
     System.out.println("Updated list of elements:");   
     hm.putIfAbsent(103, "Gaurav");  
     System.out.println("After invoking putIfAbsent() method ");  
     for(Map.Entry m:hm.entrySet()){    
          System.out.println(m.getKey()+" "+m.getValue());    
         }       
    }
} 
