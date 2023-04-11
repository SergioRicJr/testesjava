package main.app;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoasTeste {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastraPessoas cadastraPessoas;

    @Test
    void validaDadosCadastro() {
        //quando houber chamada da API retorna tal informação, para desconsiderar o uso de ap no teste
        Mockito.when(ApiDosCorreios.buscarDadosComBaseNoCep("123")).thenReturn("seu endereço");
        Pessoa pessoa = cadastraPessoas.cadastrarPessoa("Wiliam", LocalDate.of(2010, 1,1), "242421");
    
        Assertions.assertEquals("William", pessoa.nome);
    }
}
