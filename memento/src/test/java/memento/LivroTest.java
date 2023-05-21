package memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class LivroTest {

    @Test
    void deveArmazenarEstados() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoDisponivel.getInstance());
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        assertEquals(2, livro.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoDisponivel.getInstance());
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        livro.restauraEstado(0);
        assertEquals(LivroEstadoDisponivel.getInstance(), livro.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoDisponivel.getInstance());
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        livro.setEstado(LivroEstadoDisponivel.getInstance());
        livro.setEstado(LivroEstadoDevolvido.getInstance());
        livro.restauraEstado(2);
        assertEquals(LivroEstadoDisponivel.getInstance(), livro.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Livro livro = new Livro();
            livro.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }


}