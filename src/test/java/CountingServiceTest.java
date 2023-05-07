import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import javax.annotation.processing.SupportedAnnotationTypes;

public class CountingServiceTest {

    @Test
    void example1() {
        CountingService service = new CountingService();

        // подготавливаем данные:
        int expected = 3;
        // вызываем целевой метод:
        int actual = service.calculate(10_000, 3000, 20_000);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void example2() {
        CountingService service = new CountingService();

        // подготавливаем данные:
        int expected = 2;
        // вызываем целевой метод:
        int actual = service.calculate(100_000, 60_000, 150_000);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}