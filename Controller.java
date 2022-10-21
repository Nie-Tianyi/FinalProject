package controller;

import model.Game;
import view.View;

public class Controller {
    private View view;
    private Game game;

    public Controller(View view, Game game) {
        this.view = view;
        this.game = game;
    }

    /**
     * @param cmd a string that derive from the user input
     * */
    public void parseCmd(String cmd){

    }
}
