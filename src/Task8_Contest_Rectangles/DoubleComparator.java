package Task8_Contest_Rectangles;

import java.util.Comparator;

public class DoubleComparator implements Comparator<Double> {
   private static final double delta=0.00001;

   private boolean compareDouble(Double o1,Double o2) {
       double module=Math.abs(o1-o2);
       return module<=delta;

   }
    @Override
    public int compare(Double o1, Double o2) {
        if (compareDouble(o1, o2))
            return 0;
        if(o1-o2<0)
            return -1;
        else
            return 1;
    }
}
