import java.util.Arrays;
import java.util.List;

public class DesafioFilter {

    public static void main(String[] args) {
        Produto p1 = new Produto("Lapis", 1200, 0.23);
        Produto p2 = new Produto("Caneta", 200, 0.16);
        Produto p3 = new Produto("Notebook", 100, 0.10);
        Produto p4 = new Produto("Cadeira", 10, 0.25);
        Produto p5 = new Produto("Mesa", 200, 0.20);
        Produto p6 = new Produto("Carro", 21200, 0.30);
        Produto p7 = new Produto("Moto", 10200, 0.10);

        List<Produto> list = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);

        list.stream()
        .filter(p -> p.getDesconto() > 0.20)
        .filter(p -> p.getPreco() > 1000)
        .map(p -> p.getNome())
        .forEach(System.out::println);   
    }
    
}
