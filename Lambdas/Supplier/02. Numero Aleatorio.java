
import java.awt.*;
import java.util.*;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) throws Exception {

        Supplier<Double> resposta = () -> 10 + Math.random() * 50;
        System.out.println(resposta.get());
        
    }
}
