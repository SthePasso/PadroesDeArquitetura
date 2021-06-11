public class TaErrado{
    //Atributos
    private String nome;
    private double preco;
    private double precoFinal;
    //Costrutor
    public TaErrado(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    //Calcula Preço final
    public void calcularPrecoFinal(double calculo){
        this.precoFinal = this.preco + (this.preco * calculo);
    }
    public String toString(){
        return "Produto{ " + nome + ", preco = " + preco + ", precoFinal = " + precoFinal + " }";
    }

    public static void main(String[] args){
        
        TaErrado paixao = new TaErrado("Caixinha Paixao", 15);
        paixao.calcularPrecoFinal(0.5);
        System.out.println(paixao);

    }
}