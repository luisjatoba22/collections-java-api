package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    
  private Map<Long, Produto> estoqueProdutosMaps;

  public EstoqueProdutos() {
    this.estoqueProdutosMaps = new HashMap<>();
  }

  public void adicionarProduto(long cod, String nome, int quantidade, double preco){
    estoqueProdutosMaps.put(cod, new Produto(nome, quantidade, preco));
  }

  public void exibirProdutos(){
    System.out.println(estoqueProdutosMaps);
  }

  public double calcularValorTotalEstoque(){
    double valorTotal = 0d;

    if(!estoqueProdutosMaps.isEmpty()){
      for(Produto p : estoqueProdutosMaps.values()){
        valorTotal += p.getQuantidade() * p.getPreco();
      }
    }
    return valorTotal;
  }

  public Produto obterProdutoMaisCaro(){
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
    if(!estoqueProdutosMaps.isEmpty()){
      for(Produto p : estoqueProdutosMaps.values()){
        if(p.getPreco() > maiorPreco){
          maiorPreco = p.getPreco();
          produtoMaisCaro = p;
        }
      }
    }
    return produtoMaisCaro;
  }

  public Produto obterProdutoMaisBarato(){
    Produto produtoMaisBarato = null;
    double menorPreco = Double.MAX_VALUE;
    if(!estoqueProdutosMaps.isEmpty()){
      for(Produto p : estoqueProdutosMaps.values()){
        if(p.getPreco() < menorPreco){
          menorPreco = p.getPreco();
          produtoMaisBarato = p;
        }
      }
    }
    return produtoMaisBarato;
  }

  public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
    Produto maiorQuantidadeValorNoEstoque = null;
    double valorTotalDoProdutoRef = Double.MIN_VALUE;
    if(!estoqueProdutosMaps.isEmpty()){
      for(Produto p : estoqueProdutosMaps.values()){
        double valorTotalDoProduto1 = p.getQuantidade() * p.getPreco();
        if(valorTotalDoProduto1 > valorTotalDoProdutoRef){
          maiorQuantidadeValorNoEstoque = p;
          valorTotalDoProdutoRef = valorTotalDoProduto1;
        }
      }
    }
    return maiorQuantidadeValorNoEstoque;
  }

  public static void main(String[] args) {
    EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

    estoqueProdutos.adicionarProduto(1234l, "pacoca", 5, 24.0);
    estoqueProdutos.adicionarProduto(4567l, "maca", 5, 2.0);
    estoqueProdutos.adicionarProduto(7891l, "banana", 8, 3.0);
    estoqueProdutos.adicionarProduto(3216l, "salgadinho", 10, 5.0);

    estoqueProdutos.exibirProdutos();

    System.out.println("O valor total do estoque e de: "+estoqueProdutos.calcularValorTotalEstoque());

    System.out.println("O produto mais caro do estoque e: "+estoqueProdutos.obterProdutoMaisCaro());

    System.out.println("O produto mais barato do estoque e: "+estoqueProdutos.obterProdutoMaisBarato());

    System.out.println("O produto que mais 'vale' no estoque e : "+estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
  }
  
}