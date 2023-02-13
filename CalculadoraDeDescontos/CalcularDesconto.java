package CalculadoraDeDescontos;

public class CalcularDesconto {
    public void calcula20(){
    double PrecoProduto;
    PrecoProduto = 200;
    int Desconto = 20;
    double PrecoComDesconto =  PrecoProduto - (PrecoProduto*Desconto/100);
    System.out.println("o valor do produto com desconto é "
    + PrecoComDesconto+"R$");
    }
    public void calcula30(){
        double PrecoProduto;
        PrecoProduto = 200;
        int Desconto = 30;
        double PrecoComDesconto =  PrecoProduto - (PrecoProduto*Desconto/100);
        System.out.println("o valor do produto com desconto é "
        + PrecoComDesconto+"R$");
        }
        
}
