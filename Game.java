package model;

public class Game {
    private GameMap map;
    private GamePieces pieces;

    public Game() {
        map = new GameMap();
        pieces = new GamePieces();
    }


    /**
     * move the piece on (x1,y1) to the (x2,y2)
     *
     * @param curX the x coordinate of the original place
     * @param curY the y coordinate of the original place
     * @param destX the x coordinate of the destination place
     * @param destY the y coordinate of the destination place
     *
     * */
    public void move(int curX,int curY,int destX,int destY){
        if (isMoveable(curX,curY,destX,destY)){
            pieces.move(curX,curY,destX,destY);
        }
    }

    /**
     * @param curX x coordinate of current position
     * @param curY y coordinate of current position
     * @param destX x coordinate of the destination
     * @param destY y coordinate of the destination*/
    public boolean isMoveable(int curX,int curY,int destX,int destY){

        return true;
    }

    /**
     * @return return the 2d array "map" store in the GameMap class
     * */

    public int[][] getBoardState(){
        return map.getMap();
    }

    /**
     * @return return the 2d array "pieces" store in the GamePieces class
     * */
    public int[][] getPiecesState(){
        return pieces.getPieces();
    }

    /**
     * @return return true if the game has win
     * */
    public boolean isWin(){
        return pieces.isWin();
    }

}
