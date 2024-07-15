package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
      this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int convite){
      convidadoSet.add(new Convidado(nome, convite));
    }

    public void removerConvidado(int codConvite){
      Convidado convidadoParaRemover = null;

      if(!convidadoSet.isEmpty()){
        for(Convidado c : convidadoSet){
          if(c.getConvite() == codConvite){
            convidadoParaRemover = c;
            break;
          }
        } 
        convidadoSet.remove(convidadoParaRemover);
      }
       
    }

    // public void removerConvidadoPorCodigoConvite(int codigoConvite) {
    //   Convidado convidadoParaRemover = null;
    //   if (!convidadosSet.isEmpty()) {
    //     for (Convidado c : convidadosSet) {
    //       if (c.getCodigoConvite() == codigoConvite) {
    //         convidadoParaRemover = c;
    //         break;
    //       }
    //     }
    //     convidadosSet.remove(convidadoParaRemover);
    //   } 

    public int contarConvidados(){
      return convidadoSet.size();
    }

    public void exibirConvidados(){
      System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
      
      ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

      System.out.println("Existem "+ conjuntoConvidados.contarConvidados()+" convidados na lista");

      conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
      conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
      conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
      conjuntoConvidados.adicionarConvidado("Convidado 4", 1237);

      System.out.println("Existem "+ conjuntoConvidados.contarConvidados()+" convidados na lista");

      conjuntoConvidados.removerConvidado(1234);

      System.out.println("Existem "+ conjuntoConvidados.contarConvidados()+" convidados na lista");

      conjuntoConvidados.exibirConvidados();
    }
}