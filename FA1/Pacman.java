package APFA1;
public class Pacman {
    
    private String Direction;
    private Boolean Alive;
    private int Lives;
    
    public String getDirection(){
        return Direction;
    }
    
    private void setDirection(String SD){
        this.Direction = SD;
    }
    
    public Boolean getAlive(){
        return Alive;
    }
    
    private void setAlive(Boolean SA){
        this.Alive = SA;
    }
    
    public int getLives(){
        return Lives;
    }
    
    private void setLives(int SL){
        this.Lives = SL;
    }
            
}

