import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {
    Radio radiostation = new Radio();

    @Test
    public void shouldSetAmountOfRadiostations() { // проверка установки количества радиостанций
        Radio radiostation = new Radio(5);

        int expected = 5;
        int actual = radiostation.getCountOfRadiostations();
    }

    @Test
    public void shouldSetNumberOfRadiostations() { // проверка установки максимального номера радиостанции (количество радиостанций минус один)
        Radio radiostation = new Radio(53);

        int expected = 52;
        int actual = radiostation.getMaxNumberOfRadiostations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberOfRadiostation() { // проверка установки номера радиостанции от 0 до 9
        // Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(8);

        int expected = 8;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinimalNumberOfRadiostation() { // проверка установки номера радиостанции равной 0
        //Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(0);

        int expected = 0;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMaximalNumberOfRadiostation() { // проверка установки номера радиостанции равной максимальной
        Radio radiostation = new Radio(24);

        radiostation.setCurrentNumberOfRadiostation(radiostation.getMaxNumberOfRadiostations());

        int expected = 23;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetBelowMinimalNumberOfRadiostation() { // проверка установки номера радиостанции меньше 0
        // Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(5); // текущее значение номера радиостанции
        radiostation.setCurrentNumberOfRadiostation(-3); // попытка записать отрицательное значение номера радиостанции

        int expected = 5;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetAboveMaximalNumberOfRadiostation() { // проверка установки номера радиостанции больше максимальной
        Radio radiostation = new Radio(18); // количество радиостанций равно 18

        radiostation.setCurrentNumberOfRadiostation(6); // текущее значение номера радиостанции
        radiostation.setCurrentNumberOfRadiostation(radiostation.getMaxNumberOfRadiostations() + 4); // попытка записать значение номера, больше максимальной

        int expected = 6;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPlayNext() { // проверяем метод next
        // Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(4); // задаем начальное значение
        radiostation.next(); // увеличиваем на 1

        int expected = 5;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlayNextIfActualMax() { // проверяем метод next, если текущий номер радиостанции равен максимальный
        Radio radiostation = new Radio(11); // количество радиостанций равно 11, то есть номер радиостанции 0,1,..., 10;

        radiostation.setCurrentNumberOfRadiostation(radiostation.getMaxNumberOfRadiostations());
        radiostation.next(); // увеличиваем на 1

        int expected = 0;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlayPrev() { // проверяем метод prev
        //   Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(3); // задаем начальное значение номера радиостанции
        radiostation.prev(); // уменьшаем на 1

        int expected = 2;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlayPrevIfActual0() { // проверяем метод prev, если текущий номер радиостанции 0
        //  Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(0); // задаем начальное значение, равное 0
        radiostation.prev(); // уменьшаем на 1

        int expected = radiostation.getMaxNumberOfRadiostations(); // записываем максимальный номер радиостанции
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume() { // проверка установки громкости звука
        //   Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(53);

        int expected = 53;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinimalSoundVolume() { // проверка установки громкости звука равной 0
        //   Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(0);

        int expected = 0;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMaximalSoundVolume() { // проверка установки громкости звука равной 100
        //   Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(100);

        int expected = 100;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetBelowMinimalSoundVolume() { // проверка установки громкости звука меньше 0
        //   Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(26); // текущее значение громкости звука
        radiostation.setCurrentSoundVolume(-30); // попытка записать отрицательное значение громкости звука

        int expected = 26;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetAboveMaximalSoundVolume() { // проверка установки громкости звука больше 100
        //   Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(61); // текущее значение громкости звука
        radiostation.setCurrentSoundVolume(150); // попытка записать значение громкости звука , больше 100

        int expected = 61;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPlayLouder() { // проверяем метод increase
        //    Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(58); // задаем начальное значение
        radiostation.increaseCurrentSoundVolume(); // увеличиваем на 1

        int expected = 59;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlayMaximumVolumeIfIncreaseAboveIt() { // проверяем метод increase, если текущий уровень громкости максимальный
        //   Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(100); // задаем максимальную громкость звука
        radiostation.increaseCurrentSoundVolume(); // увеличиваем на 1

        int expected = 100;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlaySilent() { // проверяем метод decrease
        //   Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(36); // задаем начальное значение
        radiostation.decreaseCurrentSoundVolume(); // уменьшаем на 1

        int expected = 35;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlayMinimumVolumeIfDecreaseAboveIt() { // проверяем метод decrease, если текущий уровень громкости нулевой
        //   Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(0); // задаем минимальную громкость звука
        radiostation.decreaseCurrentSoundVolume(); // уменьшаем на 1

        int expected = 0;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
