package Atividade3;

public class Produto {
 private String nome;
 private double preco;
 private int quantidade;
 private boolean comprado;
 
public Produto(String nome, double preco, int quantidade, boolean comprado) {
	this.nome = nome;
	this.preco = preco;
	this.quantidade = quantidade;

}
public String getnome() {
	return nome;
	
	}
public double getpreco() {
	return preco;
	
	}
public int getquantidade() {
	return quantidade;
	}
public void setnome(String nome) {
	this.nome = nome;
}
public void setpreco(double preco) {
	 this.preco = preco;
}
public void setquantidade(int quantidade) {
	 this.quantidade = quantidade;
}
public boolean isComprado() {
    return comprado;
}


public double ValorTotal() {
    double total = preco * quantidade;
    double desconto = 0;

    if (total > 500) {
        desconto = 0.25;
    } else if (total > 200) {
        desconto = 0.20;
    } else if (total > 100) {
        desconto = 0.10;
    } else {
        desconto = 0; 
    }

    return total - (total * desconto);
}
public void comprarProduto() {
    this.comprado = true;
}
}