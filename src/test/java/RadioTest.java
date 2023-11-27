import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    public void shouldSetNumberOfRadiostation() { // проверка установки номера радиостанции от 0 до 9
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(8);

        int expected = 8;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinimalNumberOfRadiostation() { // проверка установки номера радиостанции равной 0
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(0);

        int expected = 0;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMaximalNumberOfRadiostation() { // проверка установки номера радиостанции равной 9
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(9);

        int expected = 9;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetBelowMinimalNumberOfRadiostation() { // проверка установки номера радиостанции меньше 0
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(5); // текущее значение номера радиостанции
        radiostation.setCurrentNumberOfRadiostation(-3); // попытка записать отрицательное значение номера радиостанции

        int expected = 5;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetAboveMaximalNumberOfRadiostation() { // проверка установки номера радиостанции больше 9
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(6); // текущее значение номера радиостанции
        radiostation.setCurrentNumberOfRadiostation(15); // попытка записать значение номера, больше 9

        int expected = 6;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPlayNext() { // проверяем метод next
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(4); // задаем начальное значение
        radiostation.next(); // увеличиваем на 1

        int expected = 5;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlayNextIfActual9() { // проверяем метод next, если текущий номер радиостанции 9
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(9); // задаем начальное значение, равное 9
        radiostation.next(); // увеличиваем на 1

        int expected = 0;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlayPrev() { // проверяем метод prev
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(3); // задаем начальное значение номера радиостанции
        radiostation.prev(); // уменьшаем на 1

        int expected = 2;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlayPrevIfActual0() { // проверяем метод prev, если текущий номер радиостанции 0
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(0); // задаем начальное значение, равное 0
        radiostation.prev(); // уменьшаем на 1

        int expected = 9;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume() { // проверка установки громкости звука
        Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(53);

        int expected = 53;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinimalSoundVolume() { // проверка установки громкости звука равной 0
        Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(0);

        int expected = 0;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMaximalSoundVolume() { // проверка установки громкости звука равной 100
        Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(100);

        int expected = 100;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetBelowMinimalSoundVolume() { // проверка установки громкости звука меньше 0
        Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(26); // текущее значение громкости звука
        radiostation.setCurrentSoundVolume(-30); // попытка записать отрицательное значение громкости звука

        int expected = 26;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetAboveMaximalSoundVolume() { // проверка установки громкости звука больше 100
        Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(61); // текущее значение громкости звука
        radiostation.setCurrentSoundVolume(150); // попытка записать значение громкости звука , больше 100

        int expected = 61;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPlayLouder() { // проверяем метод increase
        Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(58); // задаем начальное значение
        radiostation.increaseCurrentSoundVolume(); // увеличиваем на 1

        int expected = 59;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlayMaximumVolumeIfIncreaseAboveIt() { // проверяем метод increase, если текущий уровень громкости максимальный
        Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(100); // задаем максимальную громкость звука
        radiostation.increaseCurrentSoundVolume(); // увеличиваем на 1

        int expected = 100;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlaySilent() { // проверяем метод decrease
        Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(36); // задаем начальное значение
        radiostation.decreaseCurrentSoundVolume(); // уменьшаем на 1

        int expected = 35;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlayMinimumVolumeIfDecreaseAboveIt() { // проверяем метод decrease, если текущий уровень громкости нулевой
        Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(0); // задаем минимальную громкость звука
        radiostation.decreaseCurrentSoundVolume(); // уменьшаем на 1

        int expected = 0;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
