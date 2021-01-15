import java.util.function.UnaryOperator;

public class DesafioLambda {

public static void main(String[] args) {
    UnaryOperator<Double> imposto = preco -> (preco > 2500) ? preco* 0.085 : preco;
    UnaryOperator<Double> frete = preco -> (preco >= 3000) ? 100.0 : 50.0;

    Produto p1 = new Produto("Arroz", 123.00, 0);
    System.out.println(imposto.andThen(frete).apply(p1.getPreco()));
    
}

}