public class Radio {
    private int currentNumberOfRadiostation; // текущий номер станции
    private int currentSoundVolume; // текущий уровень звука

    private int countOfRadiostations; // количество радиостанций
    private int maxNumberofRadiostations;

    public Radio(int countOfRadio) { // конструктор для установки количества радиостанций
        this.countOfRadiostations = countOfRadio;
        this.maxNumberofRadiostations = this.countOfRadiostations - 1;
    }

    public Radio() {
        this.countOfRadiostations = 10;// по умолчанию 10 радиостанций
    }

    public int getCountOfRadiostations(){
        return countOfRadiostations;
    }

    public int getMaxNumberOfRadiostations(){ // геттер максимального номера станции при установке количества станций пользователем
        return maxNumberofRadiostations;
    }



    public void setCurrentNumberOfRadiostation(int newCurrentNumberOfRadiostation) {
        if (newCurrentNumberOfRadiostation < 0) { // установка номера радиостанции меньше 0
            return;
        }

        if (newCurrentNumberOfRadiostation > maxNumberofRadiostations) { // установка номера радиостанции больше максимальной
            return;
        }
        currentNumberOfRadiostation = newCurrentNumberOfRadiostation;
    }

    public int getCurrentNumberOfRadiostation() {
        return currentNumberOfRadiostation;
    }

    public void next() {
        if (currentNumberOfRadiostation == maxNumberofRadiostations) { // если текущий номер станции равен максимальной (количество станций минус 1), то следующий номер будет 0
            currentNumberOfRadiostation = 0;
        } else {
            currentNumberOfRadiostation++; // иначе просто увеличиваем номер на 1
        }
    }

    public void prev() {
        if (currentNumberOfRadiostation == 0) { // если текущий номер станции равен 0, то предыдущий будет номер максимальной (количество станций минус 1)
            currentNumberOfRadiostation = maxNumberofRadiostations;
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

    public void increaseCurrentSoundVolume() {
        if (currentSoundVolume < 100) {
            currentSoundVolume++;
        }
    }

    public void decreaseCurrentSoundVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume--;
        }
    }
}
