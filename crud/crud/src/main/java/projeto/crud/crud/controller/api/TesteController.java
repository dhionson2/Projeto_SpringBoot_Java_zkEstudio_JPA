package projeto.crud.crud.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeto.crud.crud.model.Sistema;
import projeto.crud.crud.service.SistemaService;

@RestController
@RequestMapping("api")
public class TesteController {
	
	@Autowired
	private SistemaService sistemaService;

	@GetMapping("sistemas")
	public List<Sistema> sistemas() {
		return sistemaService.buscarTodos();
	}
}
