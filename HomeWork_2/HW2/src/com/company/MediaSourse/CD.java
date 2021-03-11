package com.company.MediaSourse;

import com.company.Composition;

/**
 * Класс CD - наследник MediaSource
 * Реализует методы родительского класса для носителя - "CD"
 */
public class CD extends MediaSource {

    public CD(Composition composition) {
        super(composition);
    }

    /**
     * Метод getName() - метод получения имени музыкального носителя
     * @return строку "Cd диск"
     */
    @Override
    public String getName() {
        return "Cd диск";
    }
}
