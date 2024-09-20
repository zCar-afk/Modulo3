package atividade4;

public class Contato {
	
public int codigo;
public String nome;
public String email;
public String observacao;
public String teste;
public String telefone ;





public  Contato(int codigo, String nome, String email, String telefone, String observacao) {
	this.codigo = codigo;
	this.nome = nome;
	this.email = email;
	this.telefone = telefone;
	this.observacao = observacao;
}

public Contato DuplicarContato() {
	return new Contato(this.codigo, this.nome, this.email, this.telefone, this.observacao);
}

public int getcodigo() {
	if(codigo >= 1000 && codigo <= 9999)
		this.codigo = codigo;
		else { throw new IllegalArgumentException("Código inválido");}
	return codigo;
	
}
public String getnome() {
	return nome;
}
public String getemail() {
	
	return email;
}
public String gettelefone() {
	String teste = telefone.replaceAll("[^\\d]", "");
	if (teste.length()== 8)
		this.telefone = telefone;
	else {System.out.println("Erro: O telefone deve conter exatamente 8 dígitos.");
	
	}
	return this.telefone;
}
public String getobservacao() {
	return observacao;
}
public boolean VerificarContato() {
	return (codigo >= 1000 && codigo <= 9999)
            && nome != null && !nome.isEmpty()
            && email != null && !email.isEmpty()
            && telefone != null && !telefone.isEmpty()
            && observacao != null && !observacao.isEmpty();
}

	
}





	
	





