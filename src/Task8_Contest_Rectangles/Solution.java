package Task8_Contest_Rectangles;

public class Solution {
   static final double delta=0.00001;
   private static final DoubleComparator doubleComparator=new DoubleComparator();

   public static Point solution(Ractangle ractangle1, Ractangle ractangle2){
   Ractangle minractangle = ractangle1.square() > ractangle2.square() ? ractangle2 : ractangle1;
   Ractangle bigractangle = ractangle1.square() < ractangle2.square() ? ractangle2 : ractangle1;

   Point startPointMinRect=minractangle.getMinPoint();
   Point endPointMinRect=minractangle.getMaxPoint(); //находит макс х но не находим макс у

   Point startPointBigRect=bigractangle.getMinPoint();
   Point endPointBigRect=bigractangle.getMaxPoint();
double xEnd=endPointMinRect.getX();
double yEnd=endPointMinRect.getY();
     // for (double x = startPointMinRect.getX() ; doubleComparator.compare(x,endPointMinRect.getX()) !=0; x+=delta) {
      for (double x = startPointMinRect.getX() ; x<=xEnd; x+=delta) {
        for (double y = startPointMinRect.getY(); y<=yEnd; y+=delta) {
    //    for (double y = startPointMinRect.getY(); doubleComparator.compare(y,endPointMinRect.getY()) != 0; y+=delta) {
              double boundXSmallrect= endPointMinRect.getX()-x;
              double boundXBigrect= endPointBigRect.getX();

              double boundYSmallrect= endPointMinRect.getY()-y;
              double boundYBigrect=  endPointBigRect.getY();

             double ratioSmall= boundXSmallrect/boundYSmallrect;
             double ratioBig=boundXBigrect/boundYBigrect;

             if(doubleComparator.compare(ratioSmall,ratioBig) == 0) return new Point(x,y);
         }
      }

      return new Point(0,0);
   }
}
