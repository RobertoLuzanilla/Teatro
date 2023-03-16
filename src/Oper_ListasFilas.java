public class Oper_ListasFilas {
    Asiento prim=null;
    Asiento ulti=null;
    int cantidadAsientos;
    public void InsertarAsientos(int cantidad){
        for (int i = 0; i <cantidad; i++) {
            Asiento Nuevo = new Asiento(i);
            if (prim==null){
                prim=Nuevo;
                ulti=Nuevo;
            }else {
                ulti.sig=Nuevo;
                ulti=Nuevo;
            }
        }
        cantidadAsientos+=cantidad;
        System.out.println("Los asientos se han introducido correctamente");
    }
    public void MostrarAsientos() {
        Asiento aux=prim;
        if (aux!=null){

        }
    }
}
