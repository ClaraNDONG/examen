package Entities;

public class Professeurs {
    private int IdP;
    
    private String NomP;
    
    private String PrenomP;
    
    private String Tell;

    
    public int getIdP() {
        return IdP;
    }
    public void setIdP(int idP) {
        IdP = idP;
    }

    public String getNomP() {
        return NomP;
    }

    public void setNomP( String nomp){
        this.NomP = nomp;
    }
    public String getPrenomP() {
        return PrenomP;
    }
    public void setPrenomP(String prenomP) {
        this.PrenomP = prenomP;
    }

    public String getTell() {
        return Tell;
    }
    public void setTell(String tell) {
        Tell = tell;
    }
    public Object getString(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getString'");
    }
    
}
