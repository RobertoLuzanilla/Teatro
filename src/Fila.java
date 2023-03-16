public class Fila {
    char Letra;
    Fila sig;
    Fila ant;
    int cantidadTotalF;

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    int cantidadAsientos;
    Oper_ListasFilas opf;
    public Fila(char nombre){
        Letra=nombre;
        sig=null;
        ant=null;
        cantidadTotalF=0;
        opf=new Oper_ListasFilas();
    }

    public char getLetra() {
        return Letra;
    }

    public void setLetra(char n) {
        this.Letra = n;
    }

    public int getCantidadTotalF() {
        return cantidadTotalF;
    }

    public void setCantidadTotalF(int cantidadTotalF) {
        this.cantidadTotalF = cantidadTotalF;
    }
}
