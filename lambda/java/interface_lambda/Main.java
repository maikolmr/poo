
public class Main {
    public static void main(String[] args) {
        System.out.println("teste");
        Calculo c = (x, y) -> x + y;

        double d = c.executar(2, 3);

        System.out.println(d); 
    }
}
