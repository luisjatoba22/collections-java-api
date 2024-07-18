package map.Ordenacao;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.time.LocalDate;
import java.time.Month;

public class AgendaEventos {
    
  private Map<LocalDate, Evento> agendaEventosMap;


  public AgendaEventos() {
    this.agendaEventosMap = new HashMap<>();
  }

  
  public void adicionarEvento(LocalDate data, String nome, String atracao){
    agendaEventosMap.put(data, new Evento(nome, atracao));
  }

  public void exibirAgenda(){
    Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(agendaEventosMap);
    System.out.println(eventoTreeMap);
  }

  public void obterProximoEvento(){
    LocalDate dataAtual = LocalDate.now();

    Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(agendaEventosMap);

    for(Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()){
      if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual) ){
        System.out.println("O proximo envento: "+entry.getValue()+" acontecera na da : "+ entry.getKey());
        break;
      }
      
    } 
  }

  public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 17), "jogo de futebol", "sao paulo x gremio");
    agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 24), "jogo de futebol 2", "palmeiras x botafogo");
    agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 21), "jogo de futebol 3", "sao paulo x juventude");

    agendaEventos.exibirAgenda();

    agendaEventos.obterProximoEvento();
  }
  

    
}