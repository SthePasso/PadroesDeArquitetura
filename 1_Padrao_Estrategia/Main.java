public class Main{
    public static void main(String[] args){
        StrategyCalcSazonal strategyCalcSazonal = new StrategyCalcSazonal();
        Produto pizza = new Produto("Pizza de Brownie", 8, strategyCalcSazonal);
        pizza.calcularPrecoFinal();
        System.out.println(pizza);

        StrategyCalcNaoSazonal strategyCalcNaoSazonal = new StrategyCalcNaoSazonal();
        Produto cupcake = new Produto("Cupcake", 3, strategyCalcNaoSazonal);
        cupcake.calcularPrecoFinal();
        System.out.println(cupcake);

        StrategyCalcFimEstoque strategyCalcFimEstoque = new StrategyCalcFimEstoque();
        Produto paixao = new Produto("Caixinha Paixao", 30, strategyCalcFimEstoque);
        paixao.calcularPrecoFinal();
        System.out.println(paixao);
    }
}