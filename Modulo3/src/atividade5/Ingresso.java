package atividade5;

public class Ingresso {
	public double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Valor do ingresso: R$ " + valor;
    }
}


