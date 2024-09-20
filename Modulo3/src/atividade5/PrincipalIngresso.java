package atividade5;

public class PrincipalIngresso {

	public static void main(String[] args) {
		Evento evento = new Evento();


        evento.adicionarIngresso(new Ingresso(50.0));
        evento.adicionarIngresso(new Ingresso(50.0));
        evento.adicionarIngresso(new IngressoVIP(50.0, 25.0));
        evento.adicionarIngresso(new IngressoVIP(50.0, 25.0));

        System.out.println("Ingressos disponíveis inicialmente: 4");
        evento.mostrarIngressosNaoVendidos();


        evento.venderIngresso(0);
        evento.venderIngresso(2);
        evento.venderIngresso(1);

        System.out.println("\nIngressos restantes após as vendas:");
        evento.mostrarIngressosNaoVendidos();

        System.out.println("\nValor total dos ingressos vendidos: R$ " + 
                           String.format("%.2f", evento.computarValorTotal()));


        Ingresso ingressoNormal = new Ingresso(50.0);
        IngressoVIP ingressoVIP = new IngressoVIP(50.0, 25.0);

        System.out.println("\nPreço dos Ingressos :");
        System.out.println(ingressoNormal);
        System.out.println(ingressoVIP);
    }


	}


