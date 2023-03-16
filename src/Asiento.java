public class Asiento {
    int num;
    Asiento sig;
    boolean estado; //vendido=true disponible=false
    Oper_ListasAsientos opA;
    public Asiento(int num) {
        this.num = num;
        sig=null;
        opA=new Oper_ListasAsientos();
    }

    public int getNum() {
        return num;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
