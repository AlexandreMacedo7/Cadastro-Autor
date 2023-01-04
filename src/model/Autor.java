package model;

import model.eSexo.ESexo;


import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;

public class Autor {

    private String nome;
    private ESexo sexo;
    private String email;
    private Date data;
    private String pais;
    private String cpf;
    private Collection<Obras> obras;

    public Autor(String nome, ESexo sexo, String email, Date data, String pais, String cpf) {
        this.nome = nome;
        this.sexo = sexo;
        this.email = email;
        this.data = data;
        this.pais = pais;
        this.cpf = cpf;
    }
    public Autor(Collection<Obras> obras){
        this.obras = new HashSet<>();
    }
}
