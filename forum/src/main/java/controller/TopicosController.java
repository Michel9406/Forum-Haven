package controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.haven.forum.modelo.Curso;
import br.com.haven.forum.modelo.Topico;

@Controller
public class TopicosController {
	
	@RequestMapping("/topicos")
	@ResponseBody
	public List<Topico> Lista(){
		Topico topico = new Topico("Duvidas"," Duvidas com Spring", new Curso("Spring","Programação"));
		return Arrays.asList(topico,topico,topico);
		
		
		
	}

}
