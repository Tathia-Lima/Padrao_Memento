package memento;

public class LivroEstadoDevolvido implements LivroEstado {

    private LivroEstadoDevolvido() {};
    private static LivroEstadoDevolvido instance = new LivroEstadoDevolvido();

    public static LivroEstadoDevolvido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Devolvido";
    }


}
