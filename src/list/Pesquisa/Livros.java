package list.Pesquisa;

public class Livros {
  private String autor;
  private String titulo;
  private int anoPublicacao;
   

    public Livros(String autor, String titulo, int anoPublicacao) {
    this.autor = autor;
    this.titulo = titulo;
    this.anoPublicacao = anoPublicacao;
  }

    /**
     * @return String return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return String return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return int return the anoPublicacao
     */
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    /**
     * @param anoPublicacao the anoPublicacao to set
     */
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
      return "Livros [autor=" + autor + ", titulo=" + titulo + ", anoPublicacao=" + anoPublicacao + "]";
    }

}