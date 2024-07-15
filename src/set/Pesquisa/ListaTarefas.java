package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
      this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao, boolean concluida){
      tarefaSet.add(new Tarefa(descricao, concluida));
    }

    public void removerTarefa(String descricao){
      Tarefa tarefaParaRemover = null;
      for(Tarefa t : tarefaSet){
        if(t.getDescricao()  == descricao){
          tarefaParaRemover = t;
          break;
        }
      }
      tarefaSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas(){
      System.out.println(tarefaSet);
    }

    public int contarTarefas(){
      return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){

      Set<Tarefa> tarefasConcluidas = new HashSet<>();

      for(Tarefa t : tarefaSet){
        if(t.isConcluida() == true){
          tarefasConcluidas.add(t);
        }
      }
      return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){

      Set<Tarefa> tarefasPendentes = new HashSet<>();

      for(Tarefa t : tarefaSet){
        if(t.isConcluida() == false){
          tarefasPendentes.add(t);
        }
      }
      return tarefasPendentes;
    }

    public Tarefa marcarTarefaConcluida(String descricao){

      Tarefa tarefaAtualizada = null;

      for(Tarefa t : tarefaSet){
        if(t.getDescricao() == descricao){
          t.setConcluida(true);
          tarefaAtualizada = t;
          break;
        }
      }
      return tarefaAtualizada;
    }

    public Tarefa marcarTarefaPendente(String descricao){

      Tarefa tarefaAtualizada = null;

      for(Tarefa t : tarefaSet){
        if(t.getDescricao() == descricao){
          t.setConcluida(false);
          tarefaAtualizada = t;
          break;
        }
      }
      return tarefaAtualizada;
    }

    public Set<Tarefa> limparListaTarefas(){
      tarefaSet.clear();

      return tarefaSet;
    }



    public static void main(String[] args) {
      
      ListaTarefas listaTarefas = new ListaTarefas();

      listaTarefas.adicionarTarefa("Lavar louca", false);
      listaTarefas.adicionarTarefa("Estudar Java", true);
      listaTarefas.adicionarTarefa("Fazer marmita", false);
      listaTarefas.adicionarTarefa("Academia", false);

      listaTarefas.exibirTarefas();

      listaTarefas.removerTarefa("Fazer marmita");

      listaTarefas.exibirTarefas();

      System.out.println("O numero de tarefas e de: "+listaTarefas.contarTarefas());

      System.out.println("Essas sao as tarefas concluidas: "+ listaTarefas.obterTarefasConcluidas()); 

      System.out.println("Essas sao as tarefas penedentes: "+ listaTarefas.obterTarefasPendentes()); 

      System.out.println("A tarefa "+listaTarefas.marcarTarefaConcluida("Academia")+" esta concluida!"); 

      System.out.println("A tarefa "+listaTarefas.marcarTarefaPendente("Estudar Java")+" esta pendente!"); 

      // System.out.println("A lista de tarefas esta limpa: "+listaTarefas.limparListaTarefas());

      listaTarefas.limparListaTarefas();
      listaTarefas.exibirTarefas();

    }

    
}