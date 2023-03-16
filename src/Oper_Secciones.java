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
    public void mostrarFila(){
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

}
