package atividade5;

public class IngressoVIP extends Ingresso {
    private double valorAdicional;

    public IngressoVIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValor() {
        return super.getValor() + valorAdicional;
    }

    public String toString() {
        return "Valor do ingresso VIP: R$ " +  getValor() +
               " (Valor base: R$ " +  super.getValor() +
               ", Adicional: R$ " +  valorAdicional + ")";
    }
}
