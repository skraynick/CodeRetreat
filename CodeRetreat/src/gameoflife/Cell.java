package gameoflife;

public class Cell {
    
    private int numberOfNeighbours;
    private boolean isAlive = false;
    
    
    public Cell(int numberOfNeighbours){
       this.numberOfNeighbours = numberOfNeighbours; 
        
    }

    public boolean cellWithLessThanTwoFirendsDies() {
        if(numberOfNeighbours < 2){
            isAlive = true;
        }else{
            isAlive = false;
        }
        
        return isAlive;
    }
    
    public void setNeighbours(int numberOfNeighbours){
        this.numberOfNeighbours = numberOfNeighbours;
    }

    public boolean cellWithTwoOrThreeNeighboursShouldLive() {
        if(numberOfNeighbours == 1){
            isAlive = true;
        }else{
            isAlive = false;
        }
        return isAlive ;
    }
    
    

}
