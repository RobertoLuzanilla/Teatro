public class Seccion {
    String nombre;
    int cantFilas;
    int aDisponibles;
    int precio;
    int sientosV;
    Oper_Secciones opS;

    public int getSientosV() {
        return sientosV;
    }

    public void setSientosV(int sientosV) {
        this.sientosV = sientosV;
    }

    public Seccion(String n){
        nombre=n;
        cantFilas=0;
        aDisponibles=0;
        opS=new Oper_Secciones();
        precio=0;
        sientosV=0;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantFilas() {
        return cantFilas;
    }

    public void setCantFilas(int cantFilas) {
        this.cantFilas = cantFilas;
    }

    public int getaDisponibles() {
        return aDisponibles;
    }

    public void setaDisponibles(int aDisponibles) {
        this.aDisponibles = aDisponibles;
    }
}
