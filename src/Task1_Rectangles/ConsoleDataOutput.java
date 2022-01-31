package Task1_Rectangles;

import java.util.List;

public class ConsoleDataOutput implements DataOutput<Point> {


    @Override
    public void showData(Point point) {
        System.out.println(point);
    }
}
