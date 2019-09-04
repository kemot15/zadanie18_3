package pl.javastart.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EulerSixServiceTest {

    EulerSixService eulerSixService;
    @BeforeEach
    void setUp() {
        eulerSixService = new EulerSixService();
        eulerSixService.LOOP = 10;
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sumOfSquares() {
        int expected = 385;

        int result = eulerSixService.sumOfSquares();

        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void squaresOfSum() {
        int expected = 3025;

        int result = eulerSixService.squaresOfSum();

        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void diff() {
        int expected = 2640;

        int result = eulerSixService.diff();

        Assertions.assertThat(result).isEqualTo(expected);
    }
}