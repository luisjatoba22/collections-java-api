package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numeros;

    public SomaNumeros() {
      this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
      numeros.add(numero);
    }

    public void calcularSoma(){
      int soma = 0; 
      if(!numeros.isEmpty()){
        for(Integer numero : numeros){
          soma += numero; 
        }
      }
      System.out.println("total da soma e: "+soma);
    }

    public int encontrarMaiorNumero() {
      int maiorNumero = Integer.MIN_VALUE;
      if (!numeros.isEmpty()) {
        for (Integer numero : numeros) {
          if (numero >= maiorNumero) {
            maiorNumero = numero;
          }
        }
        return maiorNumero;
      } else {
        throw new RuntimeException("A lista está vazia!");
      }
    }

    public void encontrarMenorNumero(){
      int menorNumero = 0; 
      if(!numeros.isEmpty()){
        for(int i : numeros){
          if(i <= menorNumero){
            menorNumero = i;
          }
        }
      }
      System.out.println("o menor numero e: "+menorNumero);
    }

    public void exibirNumeros(){
      System.out.println(numeros);
    }

    public static void main(String[] args) {
      SomaNumeros numeros  = new SomaNumeros();

      numeros.adicionarNumero(1);
      numeros.adicionarNumero(2);
      numeros.adicionarNumero(3);
      numeros.adicionarNumero(4);
      numeros.adicionarNumero(5);
      numeros.adicionarNumero(6);

      numeros.calcularSoma();

      numeros.encontrarMaiorNumero();
      numeros.encontrarMenorNumero();

      numeros.exibirNumeros();
    }
}


