package memento;

import java.util.ArrayList;
import java.util.List;

public class Livro {

    private LivroEstado estado;
    private List<LivroEstado> memento = new ArrayList<LivroEstado>();

    public LivroEstado getEstado() {
        return this.estado;
    }

    public void setEstado(LivroEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<LivroEstado> getEstados() {
        return this.memento;
    }
}