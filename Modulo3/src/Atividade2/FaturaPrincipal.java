package Atividade2;
import java.util.Scanner;

public class FaturaPrincipal {

    public static void main(String[] args) {

        Fatura item1 = new Fatura(4112, "Creatina", 2, 60);
        
        Scanner input = new Scanner(System.in);


        System.out.println("Número do Item faturado: " + item1.getNumero());
        System.out.println("Descrição do Produto: " + item1.getDescricao());
        System.out.println("Quantidade: " + item1.getQuantidade());
        System.out.println("Preço unitário: " + item1.getPreco());


        System.out.print("Insira o percentual de desconto: ");
        double desconto = input.nextDouble();
        
        item1.aplicarDesconto(desconto);

        System.out.println("O valor da fatura após o desconto é: " + item1.getValorFatura());

  
        input.close();
    }
}

