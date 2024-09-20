package atividade4;



public class PrincipalContato {

	public static void main(String[] args) {
		
		
		Contato novoContato = new Contato (4123, "Neymar", "neymarjr@gmail.com", "12345678", "Irmão");
		System.out.println("Código do contato: " + novoContato.getcodigo());
		System.out.println("Nome do contato: " + novoContato.getnome());
		System.out.println("Email do contato: "+ novoContato.getemail());
		System.out.println("Numero do telefone: " + novoContato.gettelefone());
		System.out.println("Oberservação: " + novoContato.getobservacao());
		System.out.println("Contato está completamente preenchido? " + novoContato.VerificarContato());
		
		
		Contato contatoDuplicado = novoContato.DuplicarContato();
		System.out.println("\nCódigo do contato: " + contatoDuplicado.getcodigo());
		System.out.println("Nome do contato: " + contatoDuplicado.getnome());
		System.out.println("Email do contato: "+ contatoDuplicado.getemail());
		System.out.println("Numero do telefone: " + contatoDuplicado.gettelefone());
		System.out.println("Oberservação: " + contatoDuplicado.getobservacao());
		System.out.println("Contato está completamente preenchido? " + contatoDuplicado.VerificarContato());
		
		Agenda agenda = new Agenda("Agenda de Carlos", "Minha agenda de contatos");
        agenda.adicionarContato(novoContato);
        agenda.adicionarContato(contatoDuplicado);
        System.out.println("\nNome da Agenda: " +agenda.getNome());
        System.out.println("Descricão da agenda: " + agenda.getDescricao());
  
        
		Cliente cliente = new Cliente("Carlos");
        cliente.setAgenda(agenda);
        System.out.println("Nome do Cliente:" +cliente.getNome());
	}

}
