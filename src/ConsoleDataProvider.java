import java.awt.*;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class ConsoleDataProvider implements DataProvider<Double> {
   private final Scanner scanner=new Scanner(System.in);

    @Override
    public List<Double> getData() {
        List<Double> userInput = new LinkedList<Double>();
       String[]strings= scanner.nextLine().split(" ");

      for(String s:strings){
          userInput.add(Double.valueOf(s));
      }
       return userInput;

    }
}
