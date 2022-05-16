
package POJO;

import java.util.Date;

public class Productos {
   private Date Fecha_cad; 
   private int Numerolote;
   private Date Fecha_Env;
   private String pais;

    public Productos() {
    }

    public Productos(Date Fecha_cad, int Numerolote, Date Fecha_Env, String pais) {
        this.Fecha_cad = Fecha_cad;
        this.Numerolote = Numerolote;
        this.Fecha_Env = Fecha_Env;
        this.pais = pais;
    }

    public Date getFecha_cad() {
        return Fecha_cad;
    }

    public void setFecha_cad(Date Fecha_cad) {
        this.Fecha_cad = Fecha_cad;
    }

    public int getNumerolote() {
        return Numerolote;
    }

    public void setNumerolote(int Numerolote) {
        this.Numerolote = Numerolote;
    }

    public Date getFecha_Env() {
        return Fecha_Env;
    }

    public void setFecha_Env(Date Fecha_Env) {
        this.Fecha_Env = Fecha_Env;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
   
}
