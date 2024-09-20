package atividade5;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private List<Ingresso> ingressos;
    private List<Ingresso> ingressosVendidos;

    public Evento() {
        this.ingressos = new ArrayList<>();
        this.ingressosVendidos = new ArrayList<>();
    }

    public void adicionarIngresso(Ingresso ingresso) {
        ingressos.add(ingresso);
    }

    public boolean venderIngresso(int vendido) {
        if (vendido >= 0 && vendido < ingressos.size()) {
            Ingresso ingressoVendido = ingressos.remove(vendido);
            ingressosVendidos.add(ingressoVendido);
            return true;
        }
        return false;
    }

    public double computarValorTotal() {
        return ingressosVendidos.stream().mapToDouble(Ingresso::getValor).sum();
    }

    public void mostrarIngressosNaoVendidos() {
        System.out.println("Ingressos não vendidos:");
        for (int i = 0; i < ingressos.size(); i++) {
            System.out.println(i + ": " + ingressos.get(i));
        }
    }
}


