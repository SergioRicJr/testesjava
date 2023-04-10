package main.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTeste {
    @Test
    void validarCalculoDeIdade() {
        Pessoa pessoa2 = new Pessoa("OIOI", LocalDate.of(2021,1,1));
        assertEquals(2, pessoa2.getIdade());
    }
    
    @Test
    void retornaEhMaiorDeIdade() {
        Pessoa jessica = new Pessoa("jessica", LocalDate.of(2000,1,1));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());
    }

    @Test
    void retornaEhMenorDeIdade() {
        Pessoa joao = new Pessoa("joao", LocalDate.of(2015,1,1));
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }

}
