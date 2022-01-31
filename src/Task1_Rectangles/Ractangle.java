package Task1_Rectangles;

public class Ractangle {

    private Angle[]mass=new Angle[4];

    public Ractangle(Angle[] mass) {
        this.mass = mass;
    }

    public Angle[] getMass() {
        return mass;
    }

    public void setMass(Angle[] mass) {
        this.mass = mass;
    }

   public double square(){
        double maxX =0;
        double maxY =0;
        double minX =mass[0].point.getX();
        double minY =mass[0].point.getY();
       for(Angle angle:mass){
           if (maxX <angle.point.getX()) maxX =angle.point.getX();
           if (maxY <angle.point.getY()) maxY =angle.point.getY();
           if (minX>angle.point.getX())  minX =angle.point.getX();
           if (minY>angle.point.getY())  minY =angle.point.getY();
       }
       return (maxX-minX)*(maxY-minY);

   }

   private double maxX(){
        double maxX=0;
       for(Angle angle:mass){
           if (maxX <angle.point.getX()) maxX =angle.point.getX();
       }
       return maxX;

   }

   private double minX(){
        double minX=mass[0].point.getX();
        for(Angle angle:mass){
            if (minX>angle.point.getX()) minX=angle.point.getX();
        }
        return minX;
    }


    private double minY(){
        double minY=mass[0].point.getY();
        for(Angle angle:mass){
            if (minY>angle.point.getY())minY=angle.point.getY();
        }
        return minY;
    }
    private double maxY(){
        double maxY=mass[0].point.getY();
        for(Angle angle:mass){
            if (maxY>angle.point.getY()) maxY=angle.point.getY();
        }
        return maxY;
    }



    public Point getMinPoint(){
        return new Point(minX(),minY());
    }

    public Point getMaxPoint(){
        return new Point(maxX(),maxY());
    }




    public static class Angle{
        private Point point;

        public Angle(Point point) {
            this.point = point;
        }

        public Point getPoint() {
            return point;
        }

        public void setPoint(Point point) {
            this.point = point;
        }
    }
}
