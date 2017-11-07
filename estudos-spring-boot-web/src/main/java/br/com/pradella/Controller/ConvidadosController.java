package br.com.pradella.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.pradella.model.Convidado;
import br.com.pradella.repository.Convidados;


@Controller
public class ConvidadosController {

	
	@Autowired
	private Convidados convidados;
	
	
	@GetMapping("/convidados")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");
/*		modelAndView.addObject("convidados", convidados.findAll());*/
		
		Convidado convidado = new Convidado();
		convidado.setNome("Lucas");
		convidado.setQuantidadeAcompanhantes(1);
		
		modelAndView.addObject("convidados", convidado);
		
		
		return modelAndView;
	}

}
