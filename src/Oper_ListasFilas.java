public class Oper_ListasFilas {
    Asiento prim;
    Asiento ulti;
    int cantidadAsientos;
    public void InsertarAsientos(int cantidad){
        for (int i = 1; i <= cantidad; i++) {
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
        for (Asiento aux=prim; aux!=null;aux=aux.sig){
            System.out.println(aux.getNum());
        }
        System.out.println("Los asientos se han introducido correctamente");
    }
    public void AsientosDisp(char NombreFila){
        if (prim!=null){
            Asiento Busc=prim;
            String AsientosFilas="Fila " + NombreFila + ": ";
            for (;Busc.sig!=null;Busc=Busc.sig){
                if (!Busc.estado){
                    AsientosFilas+=Busc.getNum() + ", ";
                }
            }
            AsientosFilas+=Busc.getNum();
            System.out.println(AsientosFilas);
        }

    }
}
