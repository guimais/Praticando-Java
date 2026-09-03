package br.com.alura.AulasAluraJava.calculos;

import br.com.alura.AulasAluraJava.modelos.Filme;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui (Filme f) {
        tempoTotal += f.getDuracaoEmMinutos();
    }
}
