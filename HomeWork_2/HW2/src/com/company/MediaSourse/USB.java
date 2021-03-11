package com.company.MediaSourse;

import com.company.Composition;

/**
 * Класс USB - наследник MediaSource
 * Реализует методы родительского класса для носителя - "USB"
 */
public class USB extends MediaSource {

    public USB(Composition composition) {
        super(composition);
    }

    /**
     * Метод getName() - метод получения имени музыкального носителя
     * @return строку "Usb флешка"
     */
    @Override
    public String getName() {
        return "Usb флешка";
    }
}
