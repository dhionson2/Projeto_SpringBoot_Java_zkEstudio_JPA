package projeto.crud.crud.view.vm;

import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.select.annotation.WireVariable;

import projeto.crud.crud.model.Contato;
import projeto.crud.crud.repository.ContatoRepository;
import projeto.crud.crud.service.ContatoService;


public class viewContato {
	
	@WireVariable
	private ContatoService contatoService;
	private String nome;
	private List <Contato> contato;
	
	
	
	public void onBuscar() {
		
		contatoService.buscarContatos();
		
	}
	@Command
	public void onGravar() {
		contatoService.gravarNome(nome);;
	}


	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public List <Contato> getContato() {
		return contato;
	}
	public void setContato(List <Contato> contato) {
		this.contato = contato;
	}



}
