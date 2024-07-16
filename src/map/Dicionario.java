package map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
      this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
      dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
      if(!dicionarioMap.isEmpty()){
        dicionarioMap.remove(palavra);

      }
    }

    public void exibirPalavras(){
      System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
      String palavraPesquisada = null;
      
      if(!dicionarioMap.isEmpty()){
          palavraPesquisada = dicionarioMap.get(palavra);
      }

      return palavraPesquisada;
    }

    public static void main(String[] args) {
      Dicionario dicionario = new Dicionario();

      dicionario.adicionarPalavra("Coisa", "Alguma coisa");
      dicionario.adicionarPalavra("Mal", "coisa ruim");
      dicionario.adicionarPalavra("Bom", "coisa boa");
      dicionario.adicionarPalavra("naquelas", "mais ou menos");
      dicionario.adicionarPalavra("naquelas", "mais ou menos 2");


      dicionario.exibirPalavras();
      
      dicionario.removerPalavra("Bom");
      
      dicionario.exibirPalavras();

      System.out.println("Definicão da palavra pesquisada e: "+dicionario.pesquisarPorPalavra("Mal")); 

    }

    
}