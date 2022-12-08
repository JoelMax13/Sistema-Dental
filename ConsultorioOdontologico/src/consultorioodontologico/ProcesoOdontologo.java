package consultorioodontologico;

import java.util.ArrayList;

public class ProcesoOdontologo {
    
    private ArrayList<Object> a = new ArrayList<Object>();
    
    public ProcesoOdontologo(){
    }
    
    public ProcesoOdontologo(ArrayList<Object> a){
        this.a = a;
    }
    public void agregarRegistro(Odontologo p){
        this.a.add(p);
    }
    public Odontologo obtenerRegistro(int i){
        return (Odontologo)a.get(i);
    }
    public int cantidadRegistro(){
        return this.a.size();
    }
}
