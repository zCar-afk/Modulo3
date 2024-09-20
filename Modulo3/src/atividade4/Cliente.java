package atividade4;

	public class Cliente {
	    private String nome;
	    private Agenda agenda;

	    public Cliente(String nome) {
	        this.nome = nome;
	    }

	    public void setAgenda(Agenda agenda) {
	        this.agenda = agenda;
	    }

	    public Agenda getAgenda() {
	        return agenda;
	    }

	    public String getNome() {
	        return nome;
	    }
	}