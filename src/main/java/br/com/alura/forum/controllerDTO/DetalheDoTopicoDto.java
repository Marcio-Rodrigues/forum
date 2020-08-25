package br.com.alura.forum.controllerDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import br.com.alura.forum.model.Resposta;
import br.com.alura.forum.model.StatusTopico;
import br.com.alura.forum.model.Topico;

public class DetalheDoTopicoDto {

	private long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private String nomeAutor;
	private StatusTopico status;
	
	private List<RespostaDto> respostas; 
	
	public DetalheDoTopicoDto(Topico topico) {
		this.id = topico.getId();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
		this.nomeAutor = topico.getAutor().getNome();
		this.status = topico.getStatus();
		this.respostas = new ArrayList<>();
		this.respostas.addAll(topico.getRespostas().stream().map(RespostaDto::new).collect(Collectors.toList()));
	}

	public long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public StatusTopico getStatus() {
		return status;
	}

	public List<RespostaDto> getRespostas() {
		return respostas;
	}
	
}
