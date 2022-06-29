package projeto.crud.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.crud.crud.model.Sistema;
import projeto.crud.crud.repository.SistemaRepository;



@Service
public class SistemaService {
	
	@Autowired
	private SistemaRepository sistemaRepository;
	
	public List<Sistema> buscarTodos(){
		return sistemaRepository.findAll();
	}
}