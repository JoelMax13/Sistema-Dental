package consultorioodontologico;

public class Persona {
    protected String Cedula;
    protected String Nombre;
    protected String Telefono;    
    protected String Correo;
    
    public Persona(){}
    
    public String getCedula(){
        return this.Cedula;
    }
    public String getNombre(){
        return this.Nombre;
    }
    public String getTelefono(){
        return this.Telefono;
    }
    public String getCorreo(){
        return this.Correo;
    }
    public void setCedula(String Cedula){
        this.Cedula=Cedula;
    }
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    public void setTelefono(String Telefono){
        this.Telefono=Telefono;
    }
    public void setCorreo(String Correo){
        this.Correo=Correo;
    }
}
