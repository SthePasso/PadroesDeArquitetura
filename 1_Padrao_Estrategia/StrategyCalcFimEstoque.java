public class StrategyCalcFimEstoque implements StrategyCalculo{
    private final double PREJUIZO = 0.3;

    @Override
    public double calcularLucro(double preco) {
        return preco - (preco * PREJUIZO);
    }

}