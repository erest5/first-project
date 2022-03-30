import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class RoadCamera {
    public static void main(String[] args) throws IOException {
       HashMap<String, Integer> orders = new HashMap<>();

       orders.put("Ivan", 4345);
       orders.put("Olga", 76564);
       orders.put("Alex", 1234);
       orders.put("Alex 2", 23432);
       orders.put("Ekaterina", 1034753);
       orders.put("Yaroslav", 450);


       int sum = 0;

       for (Integer var : orders.values()){
           sum += var;
       }

       System.out.println(sum);




    }
}