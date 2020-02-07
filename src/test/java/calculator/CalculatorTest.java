package calculator;

import domain.Calculator;
import domain.Formula;
import domain.Formulas;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    void calculateTest() {
        Formulas formulas = new Formulas(new Formula("1 + 2"));
        int result = Calculator.startCalculate(formulas);
        assertThat(result).isEqualTo(3);

        formulas = new Formulas(new Formula("2 + 3 * 4 / 2"));
        result = Calculator.startCalculate(formulas);
        assertThat(result).isEqualTo(10);
    }


}
