package Task8_Contest_Rectangles;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataProvider<Double> dataProvider=new ConsoleDataProvider();
        DataOutput<Point> dataOutput= new ConsoleDataOutput();

        List<Double> list=dataProvider.getData();
        double firstpoin=list.get(0);
        double secondpoin=list.get(1);

Ractangle ractangleBig=new Ractangle(new Ractangle.Angle[]{new Ractangle.Angle(new Point(0,0)),
                                                        new Ractangle.Angle(new Point(firstpoin,0)),
                                                        new Ractangle.Angle(new Point(firstpoin,secondpoin)),
                                                        new Ractangle.Angle(new Point(0,secondpoin))});


Ractangle ractangleSmall=new Ractangle(new Ractangle.Angle[]{new Ractangle.Angle(new Point(list.get(2),list.get(3))),
                                                                     new Ractangle.Angle( new Point(list.get(4),list.get(5))),
                                                                   new Ractangle.Angle(new Point(list.get(6),list.get(7))),
                                                                     new Ractangle.Angle(new Point(list.get(8),list.get(9)))});

Point point=Solution.solution(ractangleBig,ractangleSmall);
dataOutput.showData(point);

    }


}
