public class LoteLibro {

    private Libro[] libros;
    private int ejemplares;



    public LoteLibro(int capacidad){
        libros = new Libro[capacidad];
        this.ejemplares = 0;
    }

    public void agregarLibro(Libro libro){
        this.libros[ejemplares] = libro;
        this.ejemplares ++;
    }

    public Libro getLibro(){
        return this.libros[ejemplares - 1];
    }

    public int prestados(){
        int contador = 0;
        for(Libro libro : libros) {
            if(libro.isPrestado()) {
                contador++;
            }
        }
        return contador;
    }
    public int getEjemplares(){
        return ejemplares;
    }

    public void prestar() {
        if(this.ejemplares<=1){
         System.out.printf("No se puede prestar el libro\n");
        }else{
            this.libros[ejemplares - 1].setPrestado();
            this.ejemplares--;
        }
    }
}
