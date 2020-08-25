package br.com.alura.forum.controllerDTO;

import javax.validation.constraints.NotNull;

import br.com.alura.forum.model.Topico;
import br.com.alura.forum.repository.TopicoRepository;

public class AtualizacaoTopicoForm {

	@NotNull 
	private String titulo;
	@NotNull
	private String mensagem;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Topico atualizar(Long id, TopicoRepository topicoRepository) {
		// TODO Auto-generated method stub
		Topico topico = topicoRepository.getOne(id);
		topico.setMensagem(this.mensagem);
		topico.setTitulo(this.titulo);
		
		return topico;
	}
	
	
}
