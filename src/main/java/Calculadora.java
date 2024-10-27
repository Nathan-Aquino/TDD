/**
 * Classe Calculadora para realizar operações matemáticas básicas.
 */
public class Calculadora {

    /**
     * Realiza a operação de adição entre dois números inteiros.
     *
     * @param a O primeiro número a ser adicionado.
     * @param b O segundo número a ser adicionado.
     * @return A soma de a e b.
     */
    public int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a operação de subtração entre dois números inteiros.
     *
     * @param a O número do qual será subtraído.
     * @param b O número a ser subtraído de a.
     * @return O resultado da subtração de b de a.
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a operação de multiplicação entre dois números inteiros.
     *
     * @param a O primeiro número a ser multiplicado.
     * @param b O segundo número a ser multiplicado.
     * @return O produto de a e b.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a operação de divisão entre dois números inteiros.
     *
     * @param a O numerador (dividendo).
     * @param b O denominador (divisor). Deve ser diferente de zero.
     * @return O quociente da divisão de a por b.
     * @throws ArithmeticException se b for zero, pois a divisão por zero é indefinida.
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return a / b;
    }
}
