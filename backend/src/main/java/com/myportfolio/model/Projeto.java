package com.myportfolio.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "projetos")
public class Projeto {
    @Id
    private String id;
    private String nome;
    private String descricao;
    private String link;
    private String imagem;
}
