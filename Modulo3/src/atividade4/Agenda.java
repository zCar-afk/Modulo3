package atividade4;

import java.util.ArrayList;
import java.util.List;


public class Agenda  {
	private List<Contato> contatos;
    private String nome;
    private String descricao;

    public Agenda(String nome, String descricao) {
        this.contatos = new ArrayList<>();
        this.nome = nome;
        this.descricao = descricao;
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}