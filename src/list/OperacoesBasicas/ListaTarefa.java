package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
  private List<Tarefa> tarefaList;

  public ListaTarefa() {
    this.tarefaList = new ArrayList<>();
  }

  public void adicionarTarefa(String descricao){
    tarefaList.add(new Tarefa(descricao));
  }
    
  public void removerTarefa(String descricao){
    List<Tarefa> tarefasRemover = new ArrayList<>();
    for(Tarefa t : tarefaList){
      if(t.getDescricao().equalsIgnoreCase(descricao)){
        tarefasRemover.add(t);
      }
    }
    tarefaList.removeAll(tarefasRemover);
  }

  public int obterNumeroTotalDeTarefas(){
    return tarefaList.size();
  }

  public void exibirNumeros(){
    System.out.println(tarefaList);
  }

  //testes
  public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();

    listaTarefa.adicionarTarefa("Tarefa 1");
    listaTarefa.adicionarTarefa("Tarefa 1");
    listaTarefa.adicionarTarefa("Tarefa 2");

    System.out.println("O numero total de tarefas: "+listaTarefa.obterNumeroTotalDeTarefas());

    listaTarefa.removerTarefa("Tarefa 2");

    System.out.println("O numero total de tarefas: "+listaTarefa.obterNumeroTotalDeTarefas());

    listaTarefa.exibirNumeros();

    
  }

    /**
     * @return List<Tarefa> return the tarefaList
     */
    public List<Tarefa> getTarefaList() {
        return tarefaList;
    }

    /**
     * @param tarefaList the tarefaList to set
     */
    public void setTarefaList(List<Tarefa> tarefaList) {
        this.tarefaList = tarefaList;
    }

}

