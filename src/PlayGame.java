/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author lamon
 */
public class PlayGame {
    
    private Board board;
    private Ship[] ships;
    
    public PlayGame(){
        // create a 10x10 board
        this.board = new Board(10,10);
        
        // collision detection of ships
        boolean[][] grid = new boolean[10][10];
        for(int i = 0; i < grid.length;i++){
            for(int j = 0; j < grid[i].length; j++){
                grid[i][j] = false;
            }
        }
        
        this.ships = new Ship[2];
        // for each ship
        for(int i = 0; i < this.ships.length; i++){
            int shipSize = (int)(Math.random()*4+2);
            // boolean to control ship generation
            boolean success = false;
            while(!success){
                int direction = (int)(Math.random()*2);
                // generate random row and col
                int startRow = (int)(Math.random()*10);
                int startCol = (int)(Math.random()*10);
                // make sure it fits right-left
                if(direction == 0 && startCol + shipSize < 10){
                    Coordinate[] spots = new Coordinate[shipSize];
                    // check it doesn't hit another ship
                }
            }
        }
    }
    
    public void playGame(){
        
    }
}
