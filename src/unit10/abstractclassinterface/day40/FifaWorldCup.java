package unit10.abstractclassinterface.day40;

public class FifaWorldCup implements GameController {
    @Override
    public void triangleButton() {
        System.out.println("Pass through");
    }

    @Override
    public void squareButton() {
        System.out.println("Take a shot");

    }

    @Override
    public void circleButton() {
        System.out.println("Cross Pass. ");

    }

    @Override
    public void xButton() {
        System.out.println("Ground Pass. ");

    }
}
