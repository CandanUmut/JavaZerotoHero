package unit10.abstractclassinterface.day39.another;

public abstract class Shape {
   private int xCoordinate;
   private int yCoordinate;

   public void moveTo(int newxCoordinate, int newYcoordinate){
       this.xCoordinate = newxCoordinate;
       this.yCoordinate = newYcoordinate;
   }
   public abstract double getArea();
   public abstract void draw();

    public Shape(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
}
