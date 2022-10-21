package model;

public class GamePieces {
    private int[][] pieces;

    public GamePieces() {
        initilizePieces();

    }

    /**
     * initialized the pieces, place the pieces at its initial place
     *
     * 9*7 2 dimensional array, denote the location of the animals
     * 8 or 18---> red/blue elephant
     * 7 or 17---> red/blue lion
     * 6 or 16---> red/blue tiger
     * 5 or 15---> red/blue leopard
     * 4 or 14---> red/blue wolf
     * 3 or 13---> red/blue dog
     * 2 or 12---> red/blue cat
     * 1 or 11---> red/blue rat
     *
     * 1~8 ---> red player
     * 11~18 ---> blue player
     * */
    private void initilizePieces(){
        pieces = new int[][]{
                {7, 0, 0, 0, 0, 0, 6},
                {0, 3, 0, 0, 0, 2, 0},
                {1, 0, 5, 0, 4, 0, 8},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {18, 0, 14, 0, 15, 0, 11},
                {0, 12, 0, 0, 0, 13, 0},
                {16, 0, 0, 0, 0, 0, 17}};
    }

    /**
     *
     * @param x coordinate x of the block.
     * @param y coordinate y of the block.
     * @return true/false;
     *
     * */
    public boolean isAnimal(int x,int y){
        return !(pieces[y][x] == 0);
    }
    public boolean isRat(int x, int y){
        return (int)pieces[y][x]%10 == 1;
    }
    public boolean isCat(int x, int y){
        return (int)pieces[y][x]%10 == 2;
    }
    public boolean isDog(int x, int y){
        return (int)pieces[y][x]%10 == 3;
    }
    public boolean isWolf(int x, int y){
        return (int)pieces[y][x]%10 == 4;
    }
    public boolean isLeopard(int x, int y){
        return (int)pieces[y][x]%10 == 5;
    }
    public boolean isTiger(int x, int y){
        return (int)pieces[y][x]%10 == 6;
    }
    public boolean isLion(int x, int y){
        return (int)pieces[y][x]%10 == 7;
    }
    public boolean isElephant(int x, int y){
        return (int)pieces[y][x]%10 == 8;
    }

    /**
     * get the coordinate of a piece
     * @param faction the faction of the chess RED/BLUE.
     * @param level the level of the chess Elephant -> 8/Lion -> 7/Tiger -> 6/Leopard -> 5/Wolf -> 4/Dog -> 3/Cat -> 2/Rat -> 1
     * @return {x,y}
     * */
    public int[] getCoordinateByAnimal(String faction,int level){
        double fictionNum = 0;
        if (faction == "RED"){
            fictionNum += 0;
        }
        if (faction == "BLUE"){
            fictionNum += 10;
        }
        fictionNum += level;

        int[] resCoor = new int[]{0,0};
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 7; j++) {
                if (pieces[i][j] == fictionNum){
                    resCoor[0] = j; // x coordinate of the piece
                    resCoor[1] = i; // y coordinate of the piece
                }
            }
        }
        return resCoor;
    }

    /**
     * @param x the x coordinate of the animal
     * @param y the y coordinate of the animal
     * @return name of the animal Elephant/Lion/Tiger/Leopard/Wolf/Dog/Cat/Rat
     * */
    public String getAnimalByCoordinate(int x,int y){
        int level = (int)pieces[x][y]%10;
        switch (level){
            case 8:
                return "Elephant";
            case 7:
                return "Lion";
            case 6:
                return "Tiger";
            case 5:
                return "Leopard";
            case 4:
                return "Wolf";
            case 3:
                return "Dog";
            case 2:
                return "Cat";
            case 1:
                return "Rat";
        }
        return "";
    }

    /**
     * get the 2d array pieces
     * @return int[][] pieces
     * */

    public int[][] getPieces() {
        return pieces;
    }

    /**
     * move the piece on (x1,y1) to the (x2,y2)
     *
     * @param x1 the x coordinate of the original place
     * @param y1 the y coordinate of the original place
     * @param x2 the x coordinate of the destination place
     * @param y2 the y coordinate of the destination place
     *
     * */

    public void move(int x1,int y1,int x2, int y2){
        pieces[y2][x2] = pieces[x1][y1];
    }

    /**
     * check any player win the game
     * @return boolean */
    public boolean isWin(){
        if (pieces[0][3] == 3 || pieces[8][3] == 3){
            return  true;
        }
        return false;
    }
}
