public class StrategyCalcSazonal implements StrategyCalculo{
    private final double LUCRO_FIXO = 3;

    @Override
    public double calcularLucro(double preco) {
        return preco * LUCRO_FIXO;
    }

}