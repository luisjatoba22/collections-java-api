package set.Ordenacao;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

  private Set<Produto> produtosSet;

  public CadastroProdutos() {
    this.produtosSet = new HashSet<>();
  }

  public void adicionarProduto(long cod, String nome, double preco, int quantidade){
    produtosSet.add(new Produto(nome, quantidade, quantidade, preco));
  }

  public Set<Produto> exibirProdutosPorNome(){

    Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
    return produtosPorNome;
  }

  public Set<Produto> exibirProdutosPorPreco(){
    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
    produtosPorPreco.addAll(produtosSet);
    return produtosPorPreco;
  }

  public static void main(String[] args) {
    // Criando uma instância do CadastroProdutos
    CadastroProdutos cadastroProdutos = new CadastroProdutos();
  
    // Adicionando produtos ao cadastro
    cadastroProdutos.adicionarProduto(4L, "Produto 1", 50d, 15);
    cadastroProdutos.adicionarProduto(1L, "Produto 2", 1000d, 10);
    cadastroProdutos.adicionarProduto(2L, "Produto 3", 1500d, 5);
    cadastroProdutos.adicionarProduto(1L, "Produto 4", 30d, 20);
    
  
    // Exibindo todos os produtos no cadastro
    System.out.println(cadastroProdutos.produtosSet);
  
    // Exibindo produtos ordenados por nome
    System.out.println(cadastroProdutos.exibirProdutosPorNome());
  
    // // Exibindo produtos ordenados por preço
    System.out.println(cadastroProdutos.exibirProdutosPorPreco());
  }
  }




