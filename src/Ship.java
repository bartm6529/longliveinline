/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author lamon
 */
public class Ship {
    private Coordinate[] coords;
    private int hitsLeft;
    private boolean[] hitSpot;
    
    // constructor
    public Ship(Coordinate[] spots){
        this.coords = spots;
        // hits = number of coordinates
        this.hitsLeft = this.coords.length;
        // initialize the boat with no hits
        this.hitSpot = new boolean[this.hitsLeft];
        for(int i = 0; i < this.hitsLeft; i++){
            this.hitSpot[i] = false;
        }
    }
    
    public boolean doesHit(int row, int col){
        for(int i = 0; i < this.coords.length; i++){
            // take a ship coordinate
            Coordinate c = this.coords[i];
            // check for a match
            if(c.getRow() == row && c.getCol() == col){
                // if so - HIT!
                return true;
            }
        }
        
        // didn't find coordinate - MISS!
        return false;
    }
    
    public boolean isSunk(){
        return this.hitsLeft == 0;
    }
    
    
    public void shoot(int row, int col){
        // go through and find the spot on boat
        for(int i = 0; i < this.coords.length;i++){
            Coordinate c = this.coords[i];
            // is this the coordinate?
            if(c.getRow() == row && c.getCol() == col){
                // make sure we didn't hit this already
                if(this.hitSpot[i] == false){
                    // register a hit
                    this.hitSpot[i] = true;
                    this.hitsLeft--;
                    break;
                }
            }
        }
    }
    
    
}
