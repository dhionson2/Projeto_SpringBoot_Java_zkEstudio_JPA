package projeto.crud.crud.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.crud.crud.model.Contato;
import projeto.crud.crud.repository.ContatoRepository;


@Service
public class ContatoService  {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	public void cadastrarContato(Contato contato)  {
		contatoRepository.save(contato);
	}
    
		
		



	
	
	
	

}
