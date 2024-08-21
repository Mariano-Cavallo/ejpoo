public class Main {
    public static void main(String[] args) {

        Libro Libro1 = new Libro();
        Libro Libro2 = new Libro();
        Libro Libro3 = new Libro();
        Libro Libro4 = new Libro();
        Libro Libro5 = new Libro();
        Libro Libro6 = new Libro();
        Libro Libro7 = new Libro();
        Libro Libro8 = new Libro();
        Libro Libro9 = new Libro();
        Libro Libro10 = new Libro();
        Libro Libro22 = new Libro();



        LoteLibro Lote1 = new LoteLibro(10);
        LoteLibro Lote2 = new LoteLibro(1);

        Lote1.agregarLibro(Libro1);
        Lote1.agregarLibro(Libro2);
        Lote1.agregarLibro(Libro3);
        Lote1.agregarLibro(Libro4);
        Lote1.agregarLibro(Libro5);
        Lote1.agregarLibro(Libro6);
        Lote1.agregarLibro(Libro7);
        Lote1.agregarLibro(Libro8);
        Lote1.agregarLibro(Libro9);
        Lote1.agregarLibro(Libro10);
        Lote2.agregarLibro(Libro22);


        System.out.printf("Ejemplares lote 1 :%d\n ",Lote1.getEjemplares());
        System.out.printf("Prestados lote 1 :%d\n ",Lote1.prestados());
        Lote1.prestar();
        System.out.printf("Ejemplares lote 1 :%d\n ",Lote1.getEjemplares());
        System.out.printf("Prestados lote 1 :%d\n ",Lote1.prestados());





        System.out.printf("Ejemplares lote 2 :%d\n ",Lote2.getEjemplares());
        System.out.printf("Prestados lote 2 :%d\n ",Lote2.prestados());
        Lote2.prestar();

        System.out.printf("Ejemplares lote 2 :%d\n ",Lote2.getEjemplares());
        System.out.printf("Prestados lote 2 :%d\n ",Lote2.prestados());









    }
}
