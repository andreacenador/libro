
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro,int numeroDePaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas= numeroDePaginas;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void imprimeAutor(){
        System.out.println("El autor es " + autor);
    }
    
    public void imprimeTitulo(){
        System.out.println("El titulo es " + titulo);
    }
    
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    
    public void imprimirDetalles(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numeroPaginas);
    }
    
    public String getDetalles(){
      String detalles;
      detalles = "Titulo: " + titulo + " // Autor: " + autor + " // Numero de paginas: " + numeroPaginas;
      return detalles;
    }
}
