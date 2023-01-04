package model;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class Obras {

    private String nome;
    private String descricao;
    private Date dataPublicacao;
    private Date dataExposicao;
    private Collection<Autor> autor;

    public Obras(String nome, String descricao, Date dataPublicacao, Date dataExposicao, Collection<Autor> autor) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataPublicacao = dataPublicacao;
        this.dataExposicao = dataExposicao;
        this.autor = new HashSet<>();
    }

}
