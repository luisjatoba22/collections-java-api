package set.Ordenacao;

import java.util.Comparator;


public class Produto implements Comparable<Produto>{
  private String nome;
  private int cod;
  private int quantidade;
  private double preco;

  public Produto(String nome, int cod, int quantidade, double preco) {
    this.nome = nome;
    this.cod = cod;
    this.quantidade = quantidade;
    this.preco = preco;
  }

  @Override
    public int compareTo(Produto p) {
      return nome.compareToIgnoreCase(p.getNome());
    }
  
    

    @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + cod;
    return result;
  }




  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Produto other = (Produto) obj;
    if (cod != other.cod)
      return false;
    return true;
  }




    @Override
  public String toString() {
    return "{ " + nome + ", c=" + cod + ", q=" + quantidade + ", " + preco + " }]";
  }




    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return int return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * @return int return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return double return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }




    

}

class ComparatorPorPreco implements Comparator<Produto>{

  @Override
  public int compare(Produto p1, Produto p2) {
    return Double.compare(p1.getPreco(), p2.getPreco());
  }

} 