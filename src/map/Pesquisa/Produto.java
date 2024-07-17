package map.Pesquisa;

public class Produto {
    private String nome;
    private int quantidade;
    private double preco;
    public Produto(String nome, int quantidade, double preco) {
      this.nome = nome;
      this.quantidade = quantidade;
      this.preco = preco;
    }

    

    @Override
    public String toString() {
      return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
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