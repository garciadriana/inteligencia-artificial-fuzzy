package fuzzy;

public class PepsiCola extends Bebida {
    @Override
    public String proporcaoMililitros(double ml) {
        return super.proporcaoMililitros(ml);
    }

    @Override
    protected double forte(double mililitros) {
        return super.caracteristica(mililitros, 60, 60, 62, 64);
    }

    @Override
    protected double suave(double mililitros) {
        return super.caracteristica(mililitros, 62, 64, 66, 68);
    }

    @Override
    protected double fraco(double mililitros) {
        return super.caracteristica(mililitros, 66, 68, 70, 70);
    }
}
