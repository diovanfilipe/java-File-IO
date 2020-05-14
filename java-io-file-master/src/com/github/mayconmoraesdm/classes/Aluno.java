package com.github.mayconmoraesdm.classes;

public class Aluno {
    private String nome;
    private String sexo;
    private Float nota1;
    private Float nota2;

    public Aluno(String nome, String sexo, String nota1, String nota2) {
        this.nome = nome;
        this.sexo = sexo;
        this.nota1 = Float.parseFloat(nota1);
        this.nota2 = Float.parseFloat(nota2);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Float getNota1() {
        return nota1;
    }

    public void setNota1(Float nota1) {
        this.nota1 = nota1;
    }

    public Float getNota2() {
        return nota2;
    }

    public void setNota2(Float nota2) {
        this.nota2 = nota2;
    }
}
