import controller.Controller;
import model.Game;

import view.View;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        Game game = new Game();
        Controller controller = new Controller(view,game);


    }
}
