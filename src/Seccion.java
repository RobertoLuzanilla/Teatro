public class Seccion {
    String nombre;
    int cantFilas;
    int aDisponibles;
    Oper_Secciones opS;
    public Seccion(String n){
        nombre=n;
        cantFilas=0;
        aDisponibles=0;
        opS=new Oper_Secciones();
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
