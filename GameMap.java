package model;

public class GameMap {
    private int[][] map;

    public GameMap() {
        map = new int[9][7];
        initializeMap();
    }

    /**
     * initializeMap
     * 9*7 2 dimensional int array
     * 0 ---> land block
     * 1 ---> water block
     * 2 ---> trap
     * 3 ---> den
     *
     */

    private void initializeMap(){

        //fill the map with 0s
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 7; j++) {
                map[i][j] = 0;
            }
        }

        //fill in the water block 1s
        int[] waterBlockNum = {1,2,4,5};
        for (int i1 = 3; i1 < 6; i1++) {
            for (int j1:waterBlockNum){
                map[i1][j1] = 1;
            }
        }
        //fill in the trap and den
        map[0][2] = 2;
        map[0][4] = 2;
        map[1][3] = 2;
        map[7][3] = 2;
        map[8][2] = 2;
        map[8][4] = 2;

        map[0][3] = 3;
        map[8][3] = 3;
    }

    /**
     * initialize the map , place the blocks(water,land,den,trap)
     * @param x coordinate x of the block.
     * @param y coordinate y of the block.
     * @return true/false;
     *
     * */
    public boolean isLand(int x, int y){
        return map[y][x] == 0;
    }

    /**
     *
     * @param x coordinate x of the block.
     * @param y coordinate y of the block.
     * @return true/false;
     *
     * */
    public boolean isWater(int x, int y){
        return map[y][x] == 1;
    }

    /**
     *
     * @param x coordinate x of the block.
     * @param y coordinate y of the block.
     * @return true/false;
     *
     * */
    public boolean isTrap(int x,int y){
        return map[y][x] == 2;
    }

    /**
     *
     * @param x coordinate x of the block.
     * @param y coordinate y of the block.
     * @return true/false;
     *
     * */
    public boolean isDen(int x,int y){
        return map[y][x] == 3;
    }

    /**
     * @return int[][] map, the 2d int array
     *
     * */
    public int[][] getMap() {
        return map;
    }
}
