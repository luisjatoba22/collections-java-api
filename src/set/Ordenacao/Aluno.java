package set.Ordenacao;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno>{

    private String nome;
    private Long matricula;
    private double media;

    public Aluno(String nome, Long matricula, double media) {
      this.nome = nome;
      this.matricula = matricula;
      this.media = media;
    }

    

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + (int) (matricula ^ (matricula >>> 32));
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
      Aluno other = (Aluno) obj;
      if (matricula != other.matricula)
        return false;
      return true;
    }



    @Override
    public String toString() {
      return nome + ", m=" + matricula + ", media=" + media + "]";
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
     * @return long return the matricula
     */
    public long getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    /**
     * @return double return the media
     */
    public double getMedia() {
        return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public int compareTo(Aluno p) {
      return nome.compareToIgnoreCase(p.getNome());
    }

}

class ComparatorPorNota implements Comparator<Aluno>{

  @Override
  public int compare(Aluno a1, Aluno a2) {
    return Double.compare(a1.getMedia(), a2.getMedia());
  }

}