package APFA1;
public class PowerPellet extends PointItem {
    
    private boolean invincibility;

    public PowerPellet(String nm) {
        super(nm);
    }
    
    public boolean getInvincibility(){
        return invincibility;
    }
    
    public void setInvincibility(boolean Gi) {
        this.invincibility = Gi ;
    }
}
