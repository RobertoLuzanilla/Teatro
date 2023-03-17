import java.util.Scanner;

public class Oper_ListasFilas {
    Asiento prim;
    Asiento ulti;
    int cantidadAsientos=1;
    Scanner sc=new Scanner(System.in);
    public void InsertarAsientos(int cantidad){
        for (int i = cantidadAsientos; i < cantidad + cantidadAsientos; i++) {
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
            }if (!Busc.estado){
                AsientosFilas+=Busc.getNum();
            }
            System.out.println(AsientosFilas);
        }
    }
    public void AsientosNoDisp(char NombreFila) {
        if (prim != null) {
            Asiento Busc = prim;
            String AsientosFilas = "Fila " + NombreFila + ": ";
            for (; Busc.sig != null; Busc = Busc.sig) {
                if (Busc.estado) { // Si el asiento está ocupado (estado = true)
                    AsientosFilas += Busc.getNum() + ", ";
                }
            }
            if (Busc.estado) { // Si el último asiento está ocupado (estado = true)
                AsientosFilas += Busc.getNum();
            }
            System.out.println(AsientosFilas);
        }
    }
    /*
    public boolean PosAsiento(int num){
        Asiento aux=prim;
        while(aux!=null && aux.num!=num){
            aux=aux.sig;
        }
        return aux != null;
    }
    */
    public boolean EstadoAsiento(int num){
        Asiento aux=prim;
        while(aux!=null && aux.num!=num){
            aux=aux.sig;
        }
        if (aux!=null){
            return aux.estado;
        }
       return true;
    }
    public void VentaDeAsiento(int AsientoV){
        Asiento venta=prim;

            while (venta.sig != null && venta.num != AsientoV) {
                venta = venta.sig;
            }
            venta.setEstado(true);

        //for (;venta.sig!=null;venta=venta.sig){
          //  if (!venta.estado){

           // }
       // }
    }
    public void desocuparAsiento(int AsientoD){
        Asiento desocupar=prim;

        while (desocupar.sig!=null && desocupar.num!= AsientoD){
            desocupar = desocupar.sig;
        }
        desocupar.setEstado(false);
    }
    public int ContarAsientos(){
       Asiento aux=prim;
       int asientoDisp=0;
        for (;aux!=null;aux=aux.sig){
            if (!aux.estado){
                asientoDisp++;
            }
        }
        return asientoDisp;
    }
    public int AsientosVendidos() {
        Asiento aux = prim;
        int asientosOcu = 0;

        while (aux!=null){
            if (aux.estado){
                asientosOcu++;
            }
            aux=aux.sig;
        }
        return asientosOcu;
    }
}
