package Atividade2;

public class Fatura {
    public int numero;
    public String descricao;
    public int quantidade;
    public double preco;

    public Fatura(int numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getNumero() {
    	 
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    
      
    

    public double getPreco() {
    	if (preco > 0) {
            this.preco = preco;
        } else {
            this.preco = 0.0;}
        return preco;
    }

    public void setPreco(double preco) {
        
        }
    

 
    public double getValorFatura() {
        return quantidade * preco;
    }

 
    public void aplicarDesconto(double porcentagemDesconto) {
        if (porcentagemDesconto > 0 && porcentagemDesconto <= 100) {
            preco -= (preco * (porcentagemDesconto / 100));
        }
    }
}

