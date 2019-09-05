package pl.javastart.eulersix.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class EulerSixServiceTest {

    EulerSixService eulerSixService;
    @BeforeEach
    void setUp() {
        eulerSixService = new EulerSixService();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sumOfSquares() {
        int expected = 14;

        int result = eulerSixService.sumOfSquares(3);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void squaresOfSum() {
        int expected = 36;

        int result = eulerSixService.squaresOfSum(3);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void diff() {
        int expected = 22;

        int result = eulerSixService.diff(3);

        assertThat(result).isEqualTo(expected);
    }
}