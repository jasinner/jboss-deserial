import java.io.Serializable;

public class Cake implements Serializable{
    private String icing;
    private String sponge;
    
    public Cake(String icing, String sponge){
        this.icing = icing;
        this.sponge = sponge;
    }
    
    public String getIcing(){
        return icing;
    }
    
    public String getSponge(){
        return sponge;
    }
}
