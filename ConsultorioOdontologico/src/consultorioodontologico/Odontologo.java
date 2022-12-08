package consultorioodontologico;

public class Odontologo extends Persona {
    private String Titulares;
    private String Especializacion;
    
    Odontologo(){
    }
    
    public String getTitulares(){
        return this.Titulares;
    }
    public String getEspecializacion(){
        return this.Especializacion;
    }
    public void setTitulares(String Titulares){
        this.Titulares = Titulares;
    }
    public void setEspecializacion(String Especializacion){
        this.Especializacion = Especializacion;
    }
}
