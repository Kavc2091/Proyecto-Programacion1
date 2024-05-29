
package projecto;

import java.util.ArrayList;

public class Cuenta {
    String numerocuenta;
    String tipocuenta;
    String tipomoneda;
    double saldoinicial;
    ArrayList<Movimiento>mismovimientos;

    public Cuenta() {
        mismovimientos=new ArrayList<Movimiento>();
    }
    
    public void addMovimiento(Movimiento m){
        mismovimientos.add(m);
    }

    public ArrayList<Movimiento> getMismovimientos() {
        return mismovimientos;
    }

    public void setMismovimientos(ArrayList<Movimiento> mismovimientos) {
        this.mismovimientos = mismovimientos;
    }
    
    public String getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public String getTipocuenta() {
        return tipocuenta;
    }

    public void setTipocuenta(String tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    public String getTipomoneda() {
        return tipomoneda;
    }

    public void setTipomoneda(String tipomoneda) {
        this.tipomoneda = tipomoneda;
    }

    public double getSaldoinicial() {
        return saldoinicial;
    }

    public void setSaldoinicial(double saldoinicial) {
        this.saldoinicial = saldoinicial;
    }
    
    
}
