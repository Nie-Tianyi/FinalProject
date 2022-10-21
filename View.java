package view;

import model.Game;

public class View {
    /**
     * get the user's input
     * @return return a string that derive from the user input
     * */
    public String getCmd(){
        return "";
    }

    /**
     * @param game Game type, print the position of all the pieces and map blocks(lands,waters,trap,den)
     * */
    public void print(Game game){
        int[][] boardState = game.getBoardState();
        int[][] piecesState = game.getPiecesState();
    }

    /**
     * print the win interface.
     * */
    public void win(){}

}
