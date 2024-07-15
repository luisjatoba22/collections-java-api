package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
  private Set<Contatos> contatoSet;

  public AgendaContatos() {
    this.contatoSet = new HashSet<>();
  }

  public void adicionarContato(String nome, int numeroTelefone){
    contatoSet.add(new Contatos(nome, numeroTelefone));
  }

  public void exbirContatos(){
    System.out.println(contatoSet);
  }

  public void pesquisarPorNome(String nome){

    Set<Contatos> contantosPorNome = new HashSet<>();

    if(!contatoSet.isEmpty()){
    for(Contatos c : contatoSet){
      if(c.getNome().startsWith(nome)){
        contantosPorNome.add(c);
      }
    }

    System.out.println(contantosPorNome);
  } else {
    throw new RuntimeException("O conjunto está vazio!");
  }
}



  public Contatos atualizarTelfone(String nome, int novoNumero){
    Contatos contatoAtualizado = null;

    for(Contatos c : contatoSet){
      if(c.getNome().equalsIgnoreCase(nome)){
        c.setNumeroTelefone(novoNumero);
        contatoAtualizado = c;
        break;
      }
    }

    return contatoAtualizado;
  }

  public static void main(String[] args) {
    
      AgendaContatos agendaContatos = new AgendaContatos();
      agendaContatos.adicionarContato("Luis ", 123456784);
      agendaContatos.adicionarContato("Luis ", 88888888);
      agendaContatos.adicionarContato("Luis Jatoba", 123456789);
      agendaContatos.adicionarContato("Luis Programador", 123456781);
      agendaContatos.adicionarContato("Luis Comissario", 123456782);
      agendaContatos.adicionarContato("Mario Quitanda", 123456783);

      agendaContatos.exbirContatos();

      
      agendaContatos.pesquisarPorNome("Mario");

      System.out.println(agendaContatos.atualizarTelfone("Mario Quitanda", 777777777)); 
  }

  
}

