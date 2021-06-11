public class Main1{
    public static void main(String[] args){
        StrategyCalcFimEstoque strategyCalcFimEstoque = new StrategyCalcFimEstoque();
        StrategyCalcSazonal strategyCalcSazonal = new StrategyCalcSazonal();
        
        Produto paixao = new Produto("Caixinha Paixao", 15, strategyCalcFimEstoque);
        paixao.calcularPrecoFinal();
        System.out.println(paixao);

        paixao.trocarDeEstrategia(strategyCalcSazonal);
        paixao.calcularPrecoFinal();
        System.out.println(paixao);
    }
}