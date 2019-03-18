package fuzzy;

public abstract class Bebida {
    public String proporcaoMililitros(double ml) {
        String paladar;
        if (forte(ml) > suave(ml) && forte(ml) > fraco(ml)) {
            paladar = "forte";
        } else if (suave(ml) > forte(ml) && suave(ml) > fraco(ml)) {
            paladar = "suave";
        } else {
            paladar = "fraco";
        }
        return paladar;
    }

    protected abstract double forte(double mililitros);

    protected abstract double suave(double mililitros);

    protected abstract double fraco(double mililitros);

    public double caracteristica(double mililitros, double inicio, double inicioConstante, double fimConstante, double fim) {
        double resultado = 0;
        if (mililitros < inicio) {
            resultado = 0;
        } else if (mililitros >= inicio && mililitros <= inicioConstante) {
            resultado = (mililitros - inicio) / (inicioConstante - inicio);
        } else if (mililitros > inicioConstante && mililitros <= fimConstante) {
            resultado = 1;
        } else if (mililitros > fimConstante && mililitros <= fim) {
            resultado = (fim - mililitros) / (fim - fimConstante);
        } else if (mililitros > fim) {
            resultado = 0;
        }
        return resultado;
    }
}