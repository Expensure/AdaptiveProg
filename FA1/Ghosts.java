package APFA1;

public class Ghosts {
    //IsHome represents the small box the ghosts live and spawn in,
    //because not all ghosts go out at the same time.
    //Usually there is like a 10 second gap between the ghosts going out.
    private Boolean IsHome;
    
    //IsRespawning represents the AI type of the ghosts.
    //if IsRespawning is true, it will find the shortest way to Home.
    //if IsRespawning is false, it will use its default AI
    private Boolean IsRespawning;
    
    private int Points;
    
    //Inky, Blinky, Pinky and Clyde all have different colors,
    //Making this string pretty useful.
    private String Color;

    public Boolean getIsHome(){
        return IsHome;
    }
    public void setIsHome(Boolean IH){
        this.IsHome = IH;
    }
    public Boolean getIsRespawning(){
        return IsRespawning;
    }
    public void setIsRespawning(Boolean IR){
        this.IsRespawning = IR;
    }
    public int getPoints(){
        return Points;
    }
    public void setPoints(int SP){
        this.Points = SP;
    }
    public String getColor(){
        return Color;
    }
    public void setColor(String Co){
        this.Color = Co;
    }
    
}
