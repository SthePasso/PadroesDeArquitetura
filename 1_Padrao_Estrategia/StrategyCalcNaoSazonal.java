public class StrategyCalcNaoSazonal implements StrategyCalculo{
    private final int LUCRO = 2;

    @Override
    public double calcularLucro(double preco) {
        return preco * LUCRO;
    }

}