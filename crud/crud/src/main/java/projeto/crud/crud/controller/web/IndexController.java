package projeto.crud.crud.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class IndexController {
	
	@RequestMapping("/index")
	public String index() {
		return "forward:index.zul";
	}
	
	@RequestMapping("/primeiraTela")
	public String primeiratela() {
		return "forward:primeiraTela.zul";
	}
}