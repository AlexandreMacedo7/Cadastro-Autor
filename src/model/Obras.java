package model;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class Obras {

    private String nome;
    private String descricao;
    private LocalDate dataPublicacao;
    private LocalDate dataExposicao;
    private Collection<Autor> autor;

    public Obras(String nome, String descricao, LocalDate dataPublicacao, LocalDate dataExposicao, Collection<Autor> autor) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataPublicacao = dataPublicacao;
        this.dataExposicao = dataExposicao;
        this.autor = new HashSet<>();
    }
    public void addAutor(Autor autor){
        this.autor.add(autor);
    }

    public Collection<Autor> getAutor() {
        return autor;
    }
}
