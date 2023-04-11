package main.app;

import java.time.LocalDate;

public class CadastraPessoas {

    private static ApiDosCorreios apiDosCorreios;
    
    public CadastraPessoas(final ApiDosCorreios apiDosCorreios) {
        this.apiDosCorreios = apiDosCorreios;
    }

    public static Pessoa cadastrarPessoa(String nome, LocalDate nascimento, String cep) {
        Pessoa pessoa = new Pessoa(nome, nascimento);
        String dadosLocal = ApiDosCorreios.buscarDadosComBaseNoCep(cep);
        pessoa.adicionarEndereco(dadosLocal);
        return pessoa;
    }

}

