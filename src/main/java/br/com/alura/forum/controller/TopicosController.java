package br.com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controllerDTO.TopicoDto;
import br.com.alura.forum.model.Topico;
import br.com.alura.forum.repository.TopicoRepository;

@RestController
public class TopicosController {
	
	@Autowired
	private TopicoRepository topicoRepository;
	
	@RequestMapping("/topicos")
	public List<TopicoDto> lista(){
//		Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programação"));
//		
//		return TopicoDto.converter(Arrays.asList(topico, topico, topico));
		
		List<Topico> topicos = topicoRepository.findAll();
		return TopicoDto.converter(topicos);
	}
}
