package org.generation.blogPessoal.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name ="tb_tema")
public class TemaModel {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	 
	 @NotBlank(message = "O atributo descrição é Obrigatório e não pode utilizar espaços em branco!")
	 private String descriçao;
	 
	 @OneToMany(mappedBy="tema")
	 @JsonIgnoreProperties("tema")
	 private List<PostagemModel> postagem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescriçao() {
		return descriçao;
	}

	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}

	public List<PostagemModel> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<PostagemModel> postagem) {
		this.postagem = postagem;
	}
	 
	 
}
