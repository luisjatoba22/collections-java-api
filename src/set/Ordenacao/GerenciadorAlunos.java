package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    
  private Set<Aluno> alunoSet;

  public GerenciadorAlunos() {
    this.alunoSet = new HashSet<>();
  }

  public void adicionarAluno(String nome, Long matricula, double media){
    alunoSet.add(new Aluno(nome, matricula, media));

  }

  public void removerAluno(long matricula){
    Aluno alunoParaRemover = null;
  
    for(Aluno a : alunoSet){
      if(a.getMatricula() == matricula){

        alunoParaRemover = a;
        alunoSet.remove(alunoParaRemover);
        break;
      }
    }

    System.out.println("O aluno "+alunoParaRemover.getNome()+" foi removido com sucesso");
  
  }

  public Set<Aluno> exibirAlunosPorNome(){
    Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
    return alunosPorNome;

    
  }

  public Set<Aluno> exibirAlunosPorNota(){
    Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota()); 
    alunosPorNota.addAll(alunoSet);
    return alunosPorNota;

    
  }

  public void exbirAlunos(){
    System.out.println(alunoSet);
  }


public static void main(String[] args) {
  GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

  // Adicionando alunos ao gerenciador
  gerenciadorAlunos.adicionarAluno("Joao", 123456L, 7.5);
  gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
  gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
  gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

  gerenciadorAlunos.removerAluno(123456L);

  System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

  System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

  gerenciadorAlunos.exbirAlunos();

}
}