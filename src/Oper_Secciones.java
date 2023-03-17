public class Oper_Secciones
{
    Fila prim;
    Fila ult;
    char letra='A';
    public void insertarFila(int A){
        for (int i = 0; i <A; i++) {
            Fila Nuevo=new Fila(letra);
            letra=(char) (letra+1);
            if (prim==null){
                prim=Nuevo;
                ult=Nuevo;
            }else {
                Nuevo.ant=ult;
                ult.sig=Nuevo;
                ult=Nuevo;
            }
        }

        System.out.println("Se ha introducido la fila correctamente");
    }
    public void mostrarFilaYAsientos(){
        Fila aux=prim;
        if (aux==null){
            System.out.println("No hay elementos en la fila");
        }else{
            if (aux==null){
                System.out.println("No se ha encontrado la fila");
            }
            System.out.println("Listas de filas");
            while (aux!=null){
                System.out.println("Fila " + aux.getLetra() + " -- " + aux.getCantidadAsientos() + " Asientos");
                aux=aux.sig;
            }
        }
    }

    public void InsertarAsientos(char letra, int CantidadA){
        Fila aux=prim;
        while (aux!=null && aux.Letra!=letra){
        aux=aux.sig;
        }
        if (aux==null){
            System.out.println("No se encontro la fila: " + letra);
        }else {
            aux.opf.InsertarAsientos(CantidadA);
            aux.setCantidadAsientos(CantidadA);
        }
    }

    public void ListarAsientos(){
        Fila aux=prim;
        System.out.println(prim.getLetra() +" " + ult.getLetra());
        for (;aux!=null;aux=aux.sig){
            aux.opf.AsientosDisp(aux.getLetra());
        }
    }
    public void ListarAsientosOcupados(){
        Fila aux=prim;
        System.out.println(prim.getLetra() + " " + ult.getLetra());
        for (;aux!=null;aux=aux.sig){
            aux.opf.AsientosNoDisp(aux.getLetra());
        }
    }
    public boolean PosFila(char Fila){
        Fila aux=prim;
        while(aux!=null && aux.Letra!=Fila){
            aux=aux.sig;
        }
       return aux != null;
    }
    public int ContarFilaA(){
        Fila aux=prim;
        int asientoDisp=0;
        for (;aux!=null;aux=aux.sig){
            asientoDisp+=aux.opf.ContarAsientos();
        }
        return asientoDisp;
    }
    public int ContarFilaO(){
        Fila aux=prim;
        int asientosOcu=0;
        for (;aux!=null;aux=aux.sig){
            asientosOcu+=aux.opf.AsientosVendidos();
        }
        return asientosOcu;
    }
    public boolean Llamar(Fila aux, int numeroAc){
       return aux.opf.EstadoAsiento(numeroAc);
    }
    public Fila EnviarFila(char Fila){
        Fila aux=prim;
        while(aux!=null && aux.Letra!=Fila){
            aux=aux.sig;
        }
        return aux;
    }
    public void llamarVender(Fila aux, int Numero){
        aux.opf.VentaDeAsiento(Numero);
    }

    public void llamarDesocupar(Fila aux, int numer){
        aux.opf.desocuparAsiento(numer);
    }

}
