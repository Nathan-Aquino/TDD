import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonacciTestes {
    private Fibonacci fibonacci;

    @BeforeEach
    public void setup() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void testeFibonacciZero() {
        Assertions.assertEquals(0, fibonacci.fibonacci(0), "F(0) deve ser 0");
    }

    @Test
    public void testeFibonacciUm() {
        Assertions.assertEquals(1, fibonacci.fibonacci(1), "F(1) deve ser 1");
    }

    @Test
    public void testeFibonacciDois() {
        Assertions.assertEquals(1, fibonacci.fibonacci(2), "F(2) deve ser 1");
    }

    @Test
    public void testeFibonacciTres() {
        Assertions.assertEquals(2, fibonacci.fibonacci(3), "F(3) deve ser 2");
    }

    @Test
    public void testeFibonacciQuatro() {
        Assertions.assertEquals(3, fibonacci.fibonacci(4), "F(4) deve ser 3");
    }

    @Test
    public void testeFibonacciCinco() {
        Assertions.assertEquals(5, fibonacci.fibonacci(5), "F(5) deve ser 5");
    }

    @Test
    public void testeFibonacciDez() {
        Assertions.assertEquals(55, fibonacci.fibonacci(10), "F(10) deve ser 55");
    }

    @Test
    public void testeFibonacciDeVinte() {
        Assertions.assertEquals(6765, fibonacci.fibonacci(20), "F(20) deve ser 6765");
    }

    @Test
    public void testeFibonacciNumeroNegativo() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> fibonacci.fibonacci(-1), "Deve lançar uma exceção para números negativos");
    }
}
