package projeto.crud.crud.view.vm;

import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;

import projeto.crud.crud.model.Contato;
import projeto.crud.crud.repository.ContatoRepository;
import projeto.crud.crud.service.ContatoService;

@VariableResolver(DelegatingVariableResolver.class)
public class viewContato {
	
	@WireVariable
	private ContatoService contatoService;
	private ContatoRepository contatoRepository;
	private String nome;
	
	private String textoNome;
	private String textoEmail;
	private String textoContato;
	
	@Command
	public void onGravar() {
		Contato contato = new Contato(textoContato);
		
		contatoService.cadastrarContato(contato);
		
		
	
	}
	





	public String getTextoNome() {
		return textoNome;
	}

	public void setTextoNome(String textoNome) {
		this.textoNome = textoNome;
	}

	public String getTextoEmail() {
		return textoEmail;
	}

	public void setTextoEmail(String textoEmail) {
		this.textoEmail = textoEmail;
	}

	public String getTextoContato() {
		return textoContato;
	}

	public void setTextoContato(String textoContato) {
		this.textoContato = textoContato;
	}



}
