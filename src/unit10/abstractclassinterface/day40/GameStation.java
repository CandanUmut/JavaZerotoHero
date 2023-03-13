package unit10.abstractclassinterface.day40;

public class GameStation {
    public static void main(String[] args) {
        FifaWorldCup fifaGame = new FifaWorldCup();
        fifaGame.triangleButton();
        fifaGame.triangleButton();
        fifaGame.circleButton();
        fifaGame.xButton();

        NbaGame nbaGame = new NbaGame();
        nbaGame.circleButton();
        nbaGame.triangleButton();
        nbaGame.xButton();
        nbaGame.squareButton();
        nbaGame.Up();
        nbaGame.Down();
        nbaGame.Left();
        nbaGame.Right();


    }
}
