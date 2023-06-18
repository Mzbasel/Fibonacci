import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;
public class FibonacciShould {

    @ParameterizedTest
    @CsvSource({"0, 0", "1, 1", "2, 1", "3,2", "5, 5", "6, 8", "7, 13"})
    public void generate_fibonacci_number_at_index_zero(int index, int expected){
        Fibonacci fibonacci = new Fibonacci();

        int fibonacciNumber = fibonacci.generate(index);

        assertThat(fibonacciNumber).isEqualTo(expected);
    }

}
