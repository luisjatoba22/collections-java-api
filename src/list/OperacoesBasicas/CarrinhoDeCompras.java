package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItem;

    public CarrinhoDeCompras(){
      this.listaItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
      listaItem.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
      List<Item> itemRemover = new ArrayList<>();
      for(Item i : listaItem){
        if(i.getNome().equalsIgnoreCase(nome)){
          itemRemover.add(i);
        }
      }
      listaItem.removeAll(itemRemover);
    }

    public void calcularValorTotal(){
      double valorTotal=0;
      for(Item i : listaItem){
        valorTotal += i.getPreco()*i.getQuantidade();     
      }
      System.out.println("total: "+valorTotal);
    }

    public void exibirItems(){
      System.out.println(listaItem);
    }


    public static void main(String[] args) {
      CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

      carrinho.adicionarItem("banana", 1.00, 1);
      carrinho.adicionarItem("maca", 2.00, 3);
      carrinho.adicionarItem("pera", 4.00, 2);

      carrinho.calcularValorTotal();

      carrinho.removerItem("maca");

      carrinho.calcularValorTotal();

      carrinho.exibirItems();
    }
    
}