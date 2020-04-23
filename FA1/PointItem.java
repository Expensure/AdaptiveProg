package APFA1;

public class PointItem{
    
    private String naam;
    private int points;
    
    public PointItem(String nm){
        naam = nm;
    }
    
    public int getPoints(){
        return points;
    }
    
    public int setPoints(int Pt){
        this.points = Pt;
        return 0;
    }
    
}