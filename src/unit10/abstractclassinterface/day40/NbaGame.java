package unit10.abstractclassinterface.day40;

public class NbaGame implements GameController,MoveControls{
    @Override
    public void triangleButton() {
        System.out.println("Pass");

    }

    @Override
    public void squareButton() {
        System.out.println("shoot");

    }

    @Override
    public void circleButton() {
        System.out.println("dunk");

    }

    @Override
    public void xButton() {
        System.out.println("trick");

    }



    @Override
    public void Up() {
        System.out.println("Player walks up");
    }

    @Override
    public void Down() {
        System.out.println("Player walks Down");

    }

    @Override
    public void Right() {
        System.out.println("Player walsk Right");

    }

    @Override
    public void Left() {
        System.out.println("Player walks left");

    }
}
