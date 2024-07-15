package list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;


    public Pessoa(String nome, int idade, double altura) {
      this.nome = nome;
      this.idade = idade;
      this.altura = altura;
    }

    //Metodo Comparable 
    public int compareTo(Pessoa p) {
      return Integer.compare(idade, p.idade);
    }
    

    @Override
    public String toString() {
      return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
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
     * @return int return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return double return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
}

class ComparatorPorAltura implements Comparator<Pessoa>{

  @Override
  public int compare(Pessoa p1, Pessoa p2) {
    return Double.compare(p1.getAltura(), p2.getAltura());
  }

}