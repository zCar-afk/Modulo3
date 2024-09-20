package Atividade3;

import java.util.Scanner;

public class ProdutoPrincipal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Informe o nome do produto: ");
        String nome = input.nextLine();

        System.out.println("Informe o preço unitário do produto: ");
        double preco = input.nextDouble();

        System.out.println("Informe a quantidade do produto: ");
        int quantidade = input.nextInt();
        
        Produto produto = new Produto(nome, preco, quantidade, false);
        
        System.out.println(produto);
        
        produto.comprarProduto();

        
        if (produto.isComprado()) {
            double valorTotal = produto.ValorTotal();
            System.out.println("\nO produto foi comprado.");
            System.out.println("Valor total a pagar : R$ " + valorTotal);
        }


        input.close();
	}

}
