package onishinji.models;

import org.bukkit.Location;

@SuppressWarnings("serial")
public class ButtonCC extends MyLocation {
 
    boolean positiv = true; 

    public ButtonCC(Location ref) {
        super(ref);
    }

    public boolean isPositiv() {
        return positiv;
    }

    public void setPositiv(boolean positiv) {
        this.positiv = positiv;
    }
 
    
    
}
