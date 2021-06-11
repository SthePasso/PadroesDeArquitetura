public class Produto{
    //Atributos
    private String nome;
    private double preco;
    private double precoFinal;

    //Classes com diferentes estrategias/tipos de calculos
    private StrategyCalculo estrategiaDeCalculo;

    //construtor
    public Produto(String nome, double preco, StrategyCalculo estrategiaDeCalculo){
        this.nome = nome;
        this.preco = preco;
        this.estrategiaDeCalculo = estrategiaDeCalculo;
    }

    //aqui eh onde a estrategia ocorre, trocas dos algoritmos
    public void calcularPrecoFinal(){
        this.precoFinal = this.estrategiaDeCalculo.calcularLucro(this.preco);
    }
    public void trocarDeEstrategia(StrategyCalculo novaEstrategia){
        this.estrategiaDeCalculo = novaEstrategia;
    }
    @Override
    public String toString(){
        return "Produto{ " + nome + ", preco = " + preco + ", precoFinal = " + precoFinal + ", estrategia de calculo = " + estrategiaDeCalculo +" }";
    }
}