package projeto.crud.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import projeto.crud.crud.model.Contato;
import projeto.crud.crud.repository.ContatoRepository;


@Service
public class ContatoService {
	
	private ContatoRepository contatoRepository;
	
	public List<Contato> buscarContatos(){
		return contatoRepository.findAll();
		
		
	}
	public Contato gravarContato(Contato contato) {
		return contatoRepository.save(contato);
	}
	public void gravarNome(Contato contato) {
		contatoRepository.save(contato);
	}
	public void gravarNome(List<Contato> contato) {
		contatoRepository.saveAll(contato);
		
	}

	
	
	
	

}
