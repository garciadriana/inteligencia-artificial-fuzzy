package fuzzy;

class Run extends Bebida {
    @Override
    public String proporcaoMililitros(double ml) {
        return super.proporcaoMililitros(ml);
    }

    @Override
    protected double forte(double mililitros) {
        return super.caracteristica(mililitros, 23, 28, 30, 30);
    }

    @Override
    protected double suave(double mililitros) {
        return super.caracteristica(mililitros, 15, 20, 25, 27);
    }

    @Override
    protected double fraco(double mililitros) {
        return super.caracteristica(mililitros, 10, 10, 15, 20);
    }
}
