package jogo.net;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Baralho {
    private List<Carta> cartas = new ArrayList<Carta>();

    public Baralho(){
        this.montar();
        this.embaralhar();
        this.exibir();
    }

    private void montar(){
        for(Valor valor: Valor.values()){
            for(Naipe naipe : Naipe.values()){
                Carta carta = new Carta();
                carta.setNaipe(naipe);
                carta.setValor(valor);
                cartas.add(carta);
            }
        }
    }

    private void embaralhar(){
        cartas.sort(Comparator.comparing(Carta::toString));
    }

    private void exibir(){
        for ( Carta Monte: cartas ) {
            System.out.println( Monte.getValor() +" de " + Monte.getNaipe());
        }
    }

}
