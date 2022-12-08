package consultorioodontologico;

import java.util.ArrayList;

public class ProcesoPaciente {
    private ArrayList<Object> a = new ArrayList<Object>();
    
    public ProcesoPaciente(){
    }
    
    public ProcesoPaciente(ArrayList<Object> a){
        this.a = a;
    }
    public void agregarRegistro(Paciente p){
        this.a.add(p);
    }
    public Paciente obtenerRegistro(int i){
        return (Paciente)a.get(i);
    }
    public int cantidadRegistro(){
        return this.a.size();
    }
}
