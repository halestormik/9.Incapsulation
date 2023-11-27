public class Radio {
    private int currentNumberOfRadiostation; // текущий номер станции
    private int currentSoundVolume; // текущий уровень звука

    public void setCurrentNumberOfRadiostation(int newCurrentNumberOfRadiostation) {
        if (newCurrentNumberOfRadiostation < 0) { // установка номера радиостанции меньше 0
            return;
        }

        if (newCurrentNumberOfRadiostation > 9) { // установка номера радиостанции больше 9
            return;
        }
        currentNumberOfRadiostation = newCurrentNumberOfRadiostation;
    }
    public int getCurrentNumberOfRadiostation() {
        return currentNumberOfRadiostation;
    }

    public void next() {
        if (currentNumberOfRadiostation == 9) { // если текущий номер станции равен 9, то следующий будет 0
            currentNumberOfRadiostation = 0;
        } else {
            currentNumberOfRadiostation++; // иначе просто увеличиваем номер на 1
        }
    }

    public void prev() {
        if (currentNumberOfRadiostation == 0) { // если текущий номер станции равен 0, то предыдущий будет 9
            currentNumberOfRadiostation = 9;
        } else {
            currentNumberOfRadiostation--; // иначе уменьшаем на 1
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < 0) { // установка уровня громкости меньше 0
            return;
        }

        if (newCurrentSoundVolume > 100) { // установка уровня громкости больше 100
            return;
        }

        currentSoundVolume = newCurrentSoundVolume;
    }

    public void increaseCurrentSoundVolume (){
        if (currentSoundVolume < 100) {
            currentSoundVolume++;
        }
    }

    public void decreaseCurrentSoundVolume (){
        if (currentSoundVolume > 0) {
            currentSoundVolume--;
        }
    }
}
