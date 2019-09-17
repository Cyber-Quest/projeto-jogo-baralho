package jogo.net;

 enum Valor {
    As, Dois, Tres, Quatro, Cinco, Seis, Sete, Oito,
    Nove, Dez, Dama, Valete, Reis;
 }

 enum Naipe {
    Copas, Espada, Ouro, Paus;
 }

public class Carta {
    private Naipe naipe;
    private Valor valor;

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public Valor getValor() {
        return valor;
    }

    @Override
    public String toString() {

        return super.toString();
    }
}
