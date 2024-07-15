package set.OperacoesBasicas;

public class Convidado {
    private String nome;
    private int convite;
    
    public Convidado(String nome, int convite) {
      this.nome = nome;
      this.convite = convite;
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
     * @return int return the convite
     */
    public int getConvite() {
        return convite;
    }

    /**
     * @param convite the convite to set
     */
    public void setConvite(int convite) {
        this.convite = convite;
    }



    @Override
    public String toString() {
      return "Convidado [nome=" + nome + ", convite=" + convite + "]";
    }



    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + convite;
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
      Convidado other = (Convidado) obj;
      if (convite != other.convite)
        return false;
      return true;
    }

    

}