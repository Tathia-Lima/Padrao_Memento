package memento;

public class LivroEstadoEmprestimoRenovado implements LivroEstado {


    private LivroEstadoEmprestimoRenovado() {
    };
    private static LivroEstadoEmprestimoRenovado instance = new LivroEstadoEmprestimoRenovado();

    public static LivroEstadoEmprestimoRenovado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Empréstimo Renovado";
    }
}

