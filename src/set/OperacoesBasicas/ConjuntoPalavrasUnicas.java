package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
      this.palavrasUnicas = new HashSet<>();
    }

    /**
     * @return Set<String> return the palavrasUnicas
     */
    public Set<String> getPalavrasUnicas() {
        return palavrasUnicas;
    }

    /**
     * @param palavrasUnicas the palavrasUnicas to set
     */
    public void setPalavrasUnicas(Set<String> palavrasUnicas) {
        this.palavrasUnicas = palavrasUnicas;
    }

    @Override
    public String toString() {
      return "ConjuntoPalavrasUnicas [palavrasUnicas=" + palavrasUnicas + "]";
    }

    public void adicionarPalavra(String palavra){
      palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
      palavrasUnicas.remove(palavra);
    }

    public boolean verificarPalavra(String palavra){
      return palavrasUnicas.contains(palavra);
     }
      
    //   if(!palavrasUnicas.isEmpty()){
    //     for(String palavraProcurar : palavrasUnicas){
    //       if(palavraProcurar == palavra){
    //         System.out.println("A palavra " + palavra + " esta na lista!");
    //       }
    //     }
    //   }
    // }

    public void exbirPalavras(){
      System.out.println(palavrasUnicas);
    }



    public static void main(String[] args) {
      
      ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
      
      conjuntoPalavrasUnicas.adicionarPalavra("maça");
      conjuntoPalavrasUnicas.adicionarPalavra("banana");
      conjuntoPalavrasUnicas.adicionarPalavra("pera");

      conjuntoPalavrasUnicas.exbirPalavras();

      conjuntoPalavrasUnicas.removerPalavra("banana");

      conjuntoPalavrasUnicas.exbirPalavras();

      System.out.println("A linguagem 'pera' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("pera"));
    }

}