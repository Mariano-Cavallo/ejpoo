import java.util.Scanner;

public class Libro {

    private static int contadorId = 0;
    private int idLibro;
    private String titulo;
    private String autor;
    private long ISBN;
    private int paginas;
    private boolean prestado;

    public Libro(){
        this.idLibro = ++contadorId;

    }
    public void mostrarId(){
        System.out.printf("%d \n",idLibro);
    }

    public void setLibro(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Titulo del libro: ");
        String texto = scanner.nextLine();
        this.titulo = texto;

        System.out.print("Autor del libro: ");
        texto = scanner.nextLine();
        this.autor = texto;

        System.out.print("Paginas del libro: ");
        int numero = scanner.nextInt();
        this.paginas = numero;

        System.out.print("ISBN del libro: ");
        numero = scanner.nextInt();
        this.ISBN = numero;

        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(){
        this.prestado = true;
    }

    public void setDevuelto(){
        this.prestado = false;
    }
}
