package APFA1;
public class Entities {
    private Double Location;
    private int count;
    private Ghosts Ghost;
    private PointItem Point;
    private Pacman Pac;
    
    public Entities(){
    }
    
    public void setLocation(Double L){
        this.Location = L;
    }
    
    public Ghosts getGhost(){
        return Ghost;
    }
    
    public void setGhost(Ghosts G){
        this.Ghost = G;
    }
    
    public PointItem getPoint(){
        return Point;
    }
    
    public void setPoint(PointItem PI){
        this.Point = PI;
    }
    
    public Pacman getPac(){
        return Pac;
    }
    
    public void setPac(Pacman PAC){
        this.Pac = PAC;
    }
}
    