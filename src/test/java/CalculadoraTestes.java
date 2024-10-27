import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTestes {
    private Calculadora calculadora;

    @BeforeEach
    public void setup() {
        calculadora = new Calculadora();
    }

    @Test
    public void testeAdicionar() {
        Assertions.assertEquals(5, calculadora.adicionar(2, 3));
        Assertions.assertEquals(-1, calculadora.adicionar(-2, 1));
        Assertions.assertEquals(0, calculadora.adicionar(-3, 3));
    }

    @Test
    public void testeSubtrair() {
        Assertions.assertEquals(1, calculadora.subtrair(3, 2));
        Assertions.assertEquals(-3, calculadora.subtrair(-2, 1));
        Assertions.assertEquals(-6, calculadora.subtrair(-3, 3));
    }

    @Test
    public void testeMultiplicar() {
        Assertions.assertEquals(6, calculadora.multiplicar(2, 3));
        Assertions.assertEquals(-2, calculadora.multiplicar(-1, 2));
        Assertions.assertEquals(0, calculadora.multiplicar(0, 5));
    }

    @Test
    public void testeDividir() {
        Assertions.assertEquals(2, calculadora.dividir(6, 3));
        Assertions.assertEquals(-2, calculadora.dividir(-4, 2));

        Assertions.assertThrows(ArithmeticException.class, () -> calculadora.dividir(5, 0), "Divisão por zero não é permitida");
    }
}
