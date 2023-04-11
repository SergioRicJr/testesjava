package main.app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    public String nome;
    public LocalDate dataNascimento;
    public String endereco;

    public Pessoa(String nome, LocalDate data) {
        this.nome = nome;
        this.dataNascimento = data;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(dataNascimento, LocalDateTime.now());
    }

    public boolean ehMaiorDeIdade() {
        return this.getIdade()>= 18;
    }

    public void adicionarEndereco(String endereco) {
        this.endereco = endereco;
    }
}
