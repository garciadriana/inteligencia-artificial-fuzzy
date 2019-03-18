package fuzzy;

public class CocaCola extends Bebida {
    @Override
    public String proporcaoMililitros(double ml) {
        return super.proporcaoMililitros(ml);
    }

    @Override
    protected double forte(double mililitros) {
        return super.caracteristica(mililitros, 50, 50, 52, 54);
    }

    @Override
    protected double suave(double mililitros) {
        return super.caracteristica(mililitros, 52, 54, 56, 58);
    }

    @Override
    protected double fraco(double mililitros) {
        return super.caracteristica(mililitros, 56, 58, 60, 60);
    }
}
