
package projecto;

import java.util.ArrayList;


public class Cliente {
    String dpi;
    String nombre;
    String telefono;
    String direccion;
    ArrayList<Cuenta>miscuentas;

    public Cliente() {
        miscuentas = new ArrayList<Cuenta>();
    }
    
    public void addCuenta(Cuenta c){
        miscuentas.add(c);
    }

    public ArrayList<Cuenta> getMiscuentas() {
        return miscuentas;
    }

    public void setMiscuentas(ArrayList<Cuenta> miscuentas) {
        this.miscuentas = miscuentas;
    }
    
    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
