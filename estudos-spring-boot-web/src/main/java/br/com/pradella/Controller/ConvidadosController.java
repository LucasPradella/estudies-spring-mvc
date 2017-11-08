package br.com.pradella.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.pradella.model.Convidado;
import br.com.pradella.repository.Convidados;


@Controller
@RequestMapping("/convidados")
public class ConvidadosController {

	
	@Autowired
	private Convidados convidados;
	
	
	/*@GetMapping("/convidados") caso nao queria usar o requestMapping*/
	@GetMapping
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");
		modelAndView.addObject("convidados", convidados.findAll());
		
/*
 * Usado para os primeiros testes ... 
 * 		Convidado convidado = new Convidado();
		convidado.setNome("Lucas");
		convidado.setQuantidadeAcompanhantes(1);
		modelAndView.addObject("convidados", convidado);
*/		
		
		modelAndView.addObject(new Convidado());
		return modelAndView;
	}
	
	/*@PostMapping("/convidados")*/
	@PostMapping
	public String salvar(Convidado convidado) {
		this.convidados.save(convidado);
		return "redirect:/convidados";
	}

}
