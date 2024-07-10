package list.Pesquisa;
import java.util.ArrayList;
import java.util.List;

public class CatalagosLivros {
  private List<Livros> listaLivros;

  public CatalagosLivros() {
    this.listaLivros = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao){
    listaLivros.add(new Livros(autor, titulo, anoPublicacao) );
  }
    
  public List<Livros> pesquisaPorAutor(String autor){
    List<Livros> lisvrosPorAutor = new ArrayList<>();
    
    if(!listaLivros.isEmpty()){
      for(Livros l:listaLivros){
        if(l.getAutor().equalsIgnoreCase(autor)){
          lisvrosPorAutor.add(l);
        }
      }
    }
    return lisvrosPorAutor;
  } 

  public List<Livros> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
    List<Livros> listaPorIntervaloDeAnos = new ArrayList<>();
    if(!listaPorIntervaloDeAnos.isEmpty()){
      for(Livros l : listaLivros){
        if(l.getAnoPublicacao() <= anoInicial && l.getAnoPublicacao() >= anoFinal){
          listaPorIntervaloDeAnos.add(l);
        }
      }
    }
    return listaPorIntervaloDeAnos;
  }

  public Livros pesquisarPorTitulo(String titulo){
    Livros livroPorTitulo = null;
    if(!listaLivros.isEmpty()){
      for(Livros l:listaLivros){
        if(l.getTitulo().equalsIgnoreCase(titulo)){
          livroPorTitulo = l;
          break;
        }
      }
    }
    return livroPorTitulo;
  }

  public static void main(String[] args) {
    // Criando uma instância do catálogo de livros
    CatalagosLivros catalogoLivros = new CatalagosLivros();

    // Adicionando livros ao catálogo
    catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
    catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
    catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
    catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

    // Exibindo livros pelo mesmo autor
    System.out.println(catalogoLivros.pesquisaPorAutor("Robert C. Martin"));

    // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
    System.out.println(catalogoLivros.pesquisaPorAutor("Autor Inexistente"));

    // Exibindo livros dentro de um intervalo de anos
    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));

    // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));

    // Exibindo livros por título
    System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

    // Exibindo livros por título (caso em que não há livros com o título especificado)
    System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
  }
}


