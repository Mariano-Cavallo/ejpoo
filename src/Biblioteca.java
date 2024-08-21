public class Biblioteca {
    private LoteLibro[] lotes;
    private int cantidadLotes = 0;



    public Biblioteca(int capacidad){
        lotes = new LoteLibro[capacidad];
    }
    public void agregarLote(LoteLibro lote){
        //agregar if para errores
        this.lotes[++cantidadLotes] = lote;
    }

}
